package CP;

import java.io.*;
import java.util.*;

public class LineTrip {
    public static int solve(int[] arr, int n, int x) {
        ArrayList<Integer> gas = new ArrayList<>();

        // Adding 0 (start point) and x (end point)
        gas.add(0);
        for (int station : arr) {
            gas.add(station);
        }
        gas.add(x);  // Add x to represent the turnaround point

        // Sorting the gas stations
        Collections.sort(gas);

        // Finding the maximum gap between consecutive gas stations
        int maxGap = 0;
        for (int i = 1; i < gas.size(); i++) {
            maxGap = Math.max(maxGap, gas.get(i) - gas.get(i - 1));
        }

        maxGap = Math.max(maxGap, 2 * (x - gas.get(gas.size() - 2)));
        return maxGap;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int ans = solve(arr, n, x);
            System.out.print(ans + "\n");
        }
    }
}
