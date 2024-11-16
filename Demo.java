public class Demo {
    public static void main(String[] args){
        int arr[] = {1, 2, 3,4,5,6,7};
        
        int n = arr.length;
        int newArr[] = new int[n];
        int k = 3;
        for(int i=0; i<n; i++){
            newArr[(i+k)%n] = arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}