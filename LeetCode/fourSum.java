import java.util.*;
class fourSum {

    public static List<List<Integer>> FourSum(int[] arr, int n, int target){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j != i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k < l){
                    long sum  = arr[i] + arr[j];
                    sum += arr[k];
                    sum += arr[l]; 
                    if(sum == target){
                        ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while(k < l && arr[k] == arr[k-1]) k++;
                        while(k < l && arr[l] == arr[l-1]) l--;
                    } else if(sum < target){
                        k++;
                    } else {
                        l--;
                    }
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
        System.out.println("Traget: ");
        int target = sc.nextInt();
        List<List<Integer>> ans = FourSum(arr, n, target);
        System.out.println(ans);
    }
}
