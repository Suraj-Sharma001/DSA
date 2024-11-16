import java.util.*;
class threeSum {

    public static List<List<Integer>> ThreeSum(int[] arr, int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
                int j = i+1;
                int k = n-1;
                    while(j < k){
                    long sum  = arr[i] + arr[j];
                    sum += arr[k];
                    if(sum == 0){
                        ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                        j++;
                        k--;
                        while(j < k && arr[j] == arr[j-1]) j++;
                        while(j < k && arr[k] == arr[k-1]) k--;
                    } else if(sum < 0){
                        j++;
                    } else {
                        k--;
                    }
            }
        }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = ThreeSum(arr, n);
        System.out.println(ans);
    }   
}
