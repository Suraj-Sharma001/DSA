import java.util.*;
class firstIdx {

    public static int firstOccurance(int arr[], int idx,  int key){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == key){
            return idx;
        } else {
            int fi = firstOccurance(arr, idx+1, key);
            return fi;
        }
    }

    public static int lastOccurance(int arr[], int idx,  int key){
        if(idx == arr.length){
            return -1;
        }
        int li = lastOccurance(arr, idx+1, key);
        if(li == -1){
            if(arr[idx] == key){
                return idx;
            } else {
                return -1;
            }
        } else {
            return li;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        int idx = firstOccurance(arr, 0, key);
        System.out.println(idx);
        int lidx = lastOccurance(arr, 0, key);
        System.out.println(lidx);
    }
}
