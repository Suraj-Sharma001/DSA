import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of coloum");
        int column = sc.nextInt();
        int [][] arr = new int [5][5];
        System.out.println("Enter array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
