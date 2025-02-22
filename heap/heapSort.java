package heap;

public class heapSort {

    public static void heapfy(int[] arr, int n, int i) {
            // place root to its correct position
            int large = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left < n && arr[large] > arr[left]) {
                large = left;
            }
            if(right < n && arr[large] > arr[right]) {
                large = right;
            }
            if(large != i) {
                int temp = arr[i];
                arr[i] = arr[large];
                arr[large] = temp;
                heapfy(arr, n, large);
            }
    }

    public static void HeapSort(int[] arr, int n) {
        for(int i = n/2-1; i >= 0; i--) {
            heapfy(arr, n, i);
        }
        for(int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapfy(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {54, 53, 55, 52, 50};
        int n = arr.length;
         HeapSort(arr, n);
         for(int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
    }
}
