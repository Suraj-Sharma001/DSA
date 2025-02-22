package Recursion;

import java.util.Scanner;

public class NQUEEN {

    static boolean isQueenSfe(int[][] chess, int row, int col) {
        for (int i = row-1, j = col; i >= 0 ; i--) {
            if(chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row-1, j = col-1; i >= 0 && j >= 0 ; i--, j--) {
            if(chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row-1, j = col+1; i >= 0 && j < chess.length ; i--, j++) {
            if(chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static void solveNQueen(int[][] chess, String q, int row) {
        int n = chess.length;
        if(row == n) {
            System.out.println(q);
            return;
        }

        for(int col = 0; col < n; col++){
            if(isQueenSfe(chess, row, col)){
                chess[row][col] = 1;
                solveNQueen(chess, q + row + "_" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row and column: ");
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        solveNQueen(chess, "", 0);
    }
}
