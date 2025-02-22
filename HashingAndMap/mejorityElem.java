package HashingAndMap;

import java.util.*;

public class mejorityElem {

    public static void majorityElement(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i + 1));
            } else {
                map.put(i, 1);
            }
        }

        for(Integer key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        majorityElement(arr, n);
    }
}
