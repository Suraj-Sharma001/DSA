package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class mergeKArray {

    public static class Pair implements Comparable<Pair>{
        int li;
        int di;
        int data;

        Pair(int li, int di, int data) {
            this.li = li;
            this.di = di;
            this.data = data;
        }

        public int compareTo(Pair o) {
            return this.data - o.data;
        }
    }

    public static ArrayList<Integer> mergeKSortedArrays(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++) {
            Pair p = new Pair(i, 0, arr[i][0]);
            pq.add(p);
        }

        while(!pq.isEmpty()) {
            Pair p = pq.remove();
            ans.add(p.data);
            p.di++;

            if(p.di < arr[p.li].length) {
                p.data = arr[p.li][p.di];
                pq.add(p);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // no of arrays
        int m = sc.nextInt(); // size of array
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> ans = mergeKSortedArrays(arr);
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
