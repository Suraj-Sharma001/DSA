public class QuickSort {

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr);
        }
    }

    static void quickSort(int arr[], int st, int end){
        if(st>=end) return;

        int pivit_idx = partition(arr,st,end);
        quickSort(arr, st, pivit_idx-1);
        quickSort(arr, pivit_idx+1, end);
    }

    static int partition(int arr[], int st, int end){
        return end;
        
    }

    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    
       
    public static void main(String[] args) {
         int arr[] = {5, 8, 9, 3, 9, };
         int n = arr.length;
         quickSort(arr, 0, n-1);

        display(arr);
}
}
