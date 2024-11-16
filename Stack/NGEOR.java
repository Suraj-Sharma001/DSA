package Stack;

import java.util.*;

public class NGEOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        arr[n-1] = -1;

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                arr[i] = -1;
            } else {
                arr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
