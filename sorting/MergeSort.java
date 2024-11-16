import java.util.Scanner;
public class MergeSort{

    public static void mergeSort(int arr[], int low, int high){
            if(low==high) return;
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
    }

    public static void merge(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                
            }
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
    }
}
