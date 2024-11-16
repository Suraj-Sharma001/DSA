package Stack;
import java.util.*;

public class stocKSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int span[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i+1;
            } else {
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
