package Arrayproblem;

import java.util.*;

public class union {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        // Iterator<Integer> it = st.iterator();
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        
        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i = 0; i < n1; i++){
            st.add(arr1[i]);
        }

        for(int i = 0; i < n2; i++){
            st.add(arr2[i]);
        }

        // iterate over the hashset
        Iterator item = st.iterator();
        for(int i = 0; i< st.size(); i++){
            System.out.println(item.next());
        }
    }
}