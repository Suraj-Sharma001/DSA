package Stack;

import java.util.Scanner;
import java.util.Stack;

public class nge_right {

    public static int[] nextGreaterElementOnRight(int n, int[] arr) {
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        nge[n-1] = -1;
        for(int i = n-2; i >= 0; i--) {
            while(!st.isEmpty() && arr[i] >= st.peek()) {
                    st.pop();
            }
            if(st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = nextGreaterElementOnRight(n, arr);
        System.out.print("Next greater elements are: ");
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
