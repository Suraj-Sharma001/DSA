package Graph;

import java.io.*;
import java.util.*;

// Node class for Huffman Tree
class Node implements Comparable<Node> {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq, Node left, Node right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    public int compareTo(Node other) {
        return this.freq - other.freq;
    }
}

public class HuffmanCompressor {
    private static Map<Character, String> huffmanCodes = new HashMap<>();
    private static Map<String, Character> reverseHuffmanCodes = new HashMap<>();

    // Build Huffman Tree
    private static Node buildHuffmanTree(Map<Character, Integer> freqMap) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (var entry : freqMap.entrySet()) {
            pq.offer(new Node(entry.getKey(), entry.getValue(), null, null));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node('\0', left.freq + right.freq, left, right);
            pq.offer(parent);
        }
        return pq.poll();
    }

    // Generate Huffman Codes
    private static void generateHuffmanCodes(Node root, String code) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.ch, code);
            reverseHuffmanCodes.put(code, root.ch);
        }
        generateHuffmanCodes(root.left, code + "0");
        generateHuffmanCodes(root.right, code + "1");
    }

    // Compress File
    public static void compress(String inputFile, String outputFile) throws IOException {
        StringBuilder text = new StringBuilder();
        Map<Character, Integer> freqMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            int ch;
            while ((ch = br.read()) != -1) {
                char character = (char) ch;
                text.append(character);
                freqMap.put(character, freqMap.getOrDefault(character, 0) + 1);
            }
        }

        Node root = buildHuffmanTree(freqMap);
        generateHuffmanCodes(root, "");

        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toString().toCharArray()) {
            encodedText.append(huffmanCodes.get(c));
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            oos.writeObject(freqMap);
            oos.writeObject(encodedText.toString());
        }
    }

    // Decompress File
    public static void decompress(String inputFile, String outputFile) throws IOException, ClassNotFoundException {
        Map<Character, Integer> freqMap;
        String encodedText;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {
            freqMap = (Map<Character, Integer>) ois.readObject();
            encodedText = (String) ois.readObject();
        }

        Node root = buildHuffmanTree(freqMap);
        generateHuffmanCodes(root, "");

        StringBuilder decodedText = new StringBuilder();
        String temp = "";
        for (char c : encodedText.toCharArray()) {
            temp += c;
            if (reverseHuffmanCodes.containsKey(temp)) {
                decodedText.append(reverseHuffmanCodes.get(temp));
                temp = "";
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write(decodedText.toString());
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String inputFile = "input.txt";
        String compressedFile = "compressed.huff";
        String outputFile = "output.txt";

        compress(inputFile, compressedFile);
        System.out.println("File compressed successfully.");

        decompress(compressedFile, outputFile);
        System.out.println("File decompressed successfully.");
    }
}
