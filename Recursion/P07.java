import java.util.Scanner;

public class P07 {

    public static void revArr(int i, int arr[],int n){
        if(i<=n/2) return;
                int temp = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = temp;
            revArr(i+1, arr, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array: ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        revArr(0,arr,n);
        System.out.println("Rreversed array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
