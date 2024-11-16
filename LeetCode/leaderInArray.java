import java.util.*;

class leaderInArray {

    public static void findLeader(int[] arr, int n){
        List<Integer> ans = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--) {
            if(arr[i] > max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        findLeader(arr,n);
    }
}
