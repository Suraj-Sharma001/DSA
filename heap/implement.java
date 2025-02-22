package heap;

public class implement {

    public static void heapfy(int[] arr, int size, int i) {
        int large = i;
        int left = 2*i;
        int right = 2*i+1;

        if(left < size && arr[large] < arr[left]) {
            large = left;
        }
        if(right < size && arr[large] < arr[right]) {
            large = right;
        }

        if(large != i) {
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
            heapfy(arr, size, large);
        }
    }

    public static class Heap {
        int[] arr = new int[100];
        int size;

        Heap() {
            arr[0] = -1;
            size = 0;
        }

        void insert(int val) {
            size = size+1;
            int idx = size;
            arr[idx] = val;

            while(idx > 1) {
                int parent = idx/2;

                if(arr[parent] < arr[idx]) {
                    int temp = arr[parent];
                    arr[parent] = arr[idx];
                    arr[idx] = temp;
                    idx = parent;
                } else {
                    return;
                }
            }
        }

        void delete() {
            if(size == 0) return;
            arr[1] = arr[size];
            size--;
            int  i = 1;
            while(i < size) {
                int leftIdx = 2*i;
                int rightIdx = 2*i+1;
                if(leftIdx < size && arr[i] < arr[leftIdx]) {
                    int temp = arr[i];
                    arr[i] = arr[leftIdx];;
                    arr[leftIdx] = temp;
                    i = leftIdx;
                } else if(rightIdx < size && arr[i] < arr[rightIdx]) {
                    int temp = arr[i];
                    arr[i] = arr[rightIdx];;
                    arr[rightIdx] = temp;
                    i = rightIdx;
                } else {
                    return;
                }
            }
        }

        void print(){
            for(int i = 1; i <= size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Heap h1 = new Heap();
        h1.insert(50);
        h1.insert(55);
        h1.insert(53);
        h1.insert(52);
        h1.insert(54);
        h1.print();
        h1.delete();
        h1.print();

        int[] arr = {-1, 54, 53, 55, 52, 50};
        int n = 5;
        for(int i = n/2; i > 0; i--) {
            heapfy(arr, n, i);
        }

        System.out.println("Array after heapfy: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
