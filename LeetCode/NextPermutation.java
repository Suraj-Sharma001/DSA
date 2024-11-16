class NextPermutation {

    public static int [] getNextPermutation(int [] arr, int n){
        int piv = -1;
        for(int i = n-2; i>=0; i--){
            if(arr[i] < arr[i+1]) {
                piv = i;
                break;
            }
        }
        if(piv == -1){
            int i = 0;
            int j = n-1;
            while(i <= j){
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                return arr;
            }
        }

        for(int i = n-1; i > piv; i--){
            if(arr[i] > arr[piv]){
                int temp = arr[i];
                arr[i] = arr[piv];
                arr[piv] = temp;
                break;
            }
        }
        int i = piv+1;
        int j = n-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        int n = arr.length;
        getNextPermutation(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}