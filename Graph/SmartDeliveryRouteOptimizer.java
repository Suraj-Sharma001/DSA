package Graph;
import java.util.List;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Edge {
    String dest;
    int distance;
    int time;
    public Edge(String dest, int distance, int time) {
        this.dest = dest;
        this.distance = distance;
        this.time = time;
    }
}

class Graph {
    private final Map<String, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addLocation(String location) {
        adjList.putIfAbsent(location, new ArrayList<>());
    }

    public void addRoute(String src, String dest, int distance, int time) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(new Edge(dest, distance, time));
        adjList.get(dest).add(new Edge(src, distance, time)); // Undirected Graph
    }

    public void updateTrafficConditions() {
        for (var entry : adjList.entrySet()) {
            for (Edge edge : entry.getValue()) {
                edge.time = ThreadLocalRandom.current().nextInt(30, 300); // Simulating real-time traffic changes
            }
        }
    }

    public String findOptimalRoute(String start, String end, String criteria) {
        if (!adjList.containsKey(start) || !adjList.containsKey(end)) {
            return "Error: One or both locations not found in the graph.";
        }

        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> criteria.equals("time") ? e.time : e.distance));
        Map<String, String> previous = new HashMap<>();

        for (String node : adjList.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        pq.add(new Edge(start, 0, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            String node = current.dest;
            int value = criteria.equals("time") ? current.time : current.distance;

            if (value > distances.get(node)) continue;

            for (Edge neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
                int newValue = distances.get(node) + (criteria.equals("time") ? neighbor.time : neighbor.distance);
                if (newValue < distances.get(neighbor.dest)) {
                    distances.put(neighbor.dest, newValue);
                    pq.add(new Edge(neighbor.dest, neighbor.distance, neighbor.time));
                    previous.put(neighbor.dest, node);
                }
            }
        }

        if (distances.get(end) == Integer.MAX_VALUE) {
            return "No route found between " + start + " and " + end;
        }

        List<String> path = new ArrayList<>();
        for (String at = end; at != null; at = previous.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        return "Optimal route based on " + criteria + " from " + start + " to " + end + " takes " + distances.get(end) + (criteria.equals("time") ? " minutes.\nPath: " : " km.\nPath: ") + String.join(" -> ", path);
    }
}

public class SmartDeliveryRouteOptimizer {
    private static Graph deliveryGraph = new Graph();
    private static JComboBox<String> startLocation, endLocation, optimizationCriteria;
    private static JTextArea resultArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smart Delivery Route Optimizer");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));

        deliveryGraph.addLocation("Delhi");
        deliveryGraph.addLocation("Mumbai");
        deliveryGraph.addLocation("Bangalore");
        deliveryGraph.addLocation("Chennai");
        deliveryGraph.addLocation("Kolkata");
        deliveryGraph.addLocation("Hyderabad");
        deliveryGraph.addLocation("Pune");

        deliveryGraph.addRoute("Delhi", "Mumbai", 1400, 1200);
        deliveryGraph.addRoute("Delhi", "Mumbai", 1000, 1500);
        deliveryGraph.addRoute("Delhi", "Bangalore", 2100, 1800);
        deliveryGraph.addRoute("Delhi", "Chennai", 2200, 1900);
        deliveryGraph.addRoute("Mumbai", "Bangalore", 980, 800);
        deliveryGraph.addRoute("Mumbai", "Chennai", 1300, 1100);
        deliveryGraph.addRoute("Bangalore", "Chennai", 350, 300);
        deliveryGraph.addRoute("Kolkata", "Delhi", 1500, 1300);
        deliveryGraph.addRoute("Kolkata", "Mumbai", 1950, 1700);
        deliveryGraph.addRoute("Kolkata", "Chennai", 1600, 1400);
        deliveryGraph.addRoute("Hyderabad", "Bangalore", 570, 500);
        deliveryGraph.addRoute("Hyderabad", "Chennai", 630, 550);
        deliveryGraph.addRoute("Pune", "Mumbai", 150, 120);
        deliveryGraph.addRoute("Pune", "Hyderabad", 560, 480);

        String[] locations = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata", "Hyderabad", "Pune"};
        startLocation = new JComboBox<>(locations);
        endLocation = new JComboBox<>(locations);
        optimizationCriteria = new JComboBox<>(new String[]{"distance", "time"});
        JButton findRouteButton = new JButton("Find Optimal Route");
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        findRouteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String start = (String) startLocation.getSelectedItem();
                String end = (String) endLocation.getSelectedItem();
                String criteria = (String) optimizationCriteria.getSelectedItem();
                resultArea.setText(deliveryGraph.findOptimalRoute(start, end, criteria));
            }
        });

        frame.add(new JLabel("Select Starting Location:"));
        frame.add(startLocation);
        frame.add(new JLabel("Select Destination:"));
        frame.add(endLocation);
        frame.add(new JLabel("Optimize by:"));
        frame.add(optimizationCriteria);
        frame.add(findRouteButton);
        frame.add(new JScrollPane(resultArea));

        frame.setVisible(true);
    }
}