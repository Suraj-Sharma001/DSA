import java.util.Scanner;
class setMatrixZero {

    public static void matrixZero(int arr[][], int r, int c){
        int row[] = new int[r];
        int col[] = new int[c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if((row[i]== 1) || (col[j]== 1)){
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter the matrix: ");
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        matrixZero(arr,r,c);
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
