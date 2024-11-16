package Stack;
import java.util.*;;

public class slidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 4;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        //find the next greater element
        int nge[] = new int[n];
        st.push(n-1);
        nge[n-1] = n;
        
        for(int i=n-2; i>=0; i--){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            } if(st.size() == 0){
                nge[i] = n;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<=n-k;i++){
            int j=i;
            while(nge[j] <k+i){
                j = nge[j];
            }
            System.out.print(arr[j]+" ");
        }
    }
}
