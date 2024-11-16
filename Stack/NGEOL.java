package Stack;
import java.util.*;

public class NGEOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int nge[] = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size()>0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i]);
        }
    }
}