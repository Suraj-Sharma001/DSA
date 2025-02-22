package Recursion;

public class SUDOKUSolver {

    public static boolean isSafe(char[][] board, int row, int col, int dig) {

        // row check
        for (int j = 0; j < 9; j++){
            if(board[row][j] == dig){
                return false;
            }
        }

        // column check
        for(int i = 0; i < 9; i++){
            if(board[i][col] == dig) {
                return false;
            }
        }

        // check inside the grid
        int str = (row/3)*3;
        int stc = (col/3)*3;
        for (int i = str; i <= str+2; i++) {
            for (int j = stc; j <= stc+2; j++) {
                if(board[i][j] == dig){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(char[][] board, int row, int col) {

        if(row == 9){  // base case -> last row
            return true;
        }

        int nextRow = row;
        int nextCol = col+1;

        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(board[row][col] != '_'){
            return solveSudoku(board, nextRow, nextCol);
        }

        for(char dig = '1'; dig <= '9'; dig++){
            if(isSafe(board, row, col, dig)){
                board[row][col] = dig;  // place the digit
                if(solveSudoku(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '_';   // backtracking process
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        int r = 9;
        int c = 9;
        char[][] board =
        {
           {'2', '_', '_', '_', '_', '1', '4', '_', '_'},
           {'7', '_', '_', '_', '9', '_', '_', '_', '_'},
           {'_', '3', '_', '_', '5', '6', '_', '_', '2'},
           {'_', '7', '_', '2', '1', '8', '5', '_', '6'},
           {'1', '_', '2', '_', '_', '5', '9', '3', '_'},
           {'_', '6', '_', '_', '_', '9', '_', '_', '_'},
           {'6', '_', '_', '_', '8', '_', '_', '_', '_'},
           {'9', '_', '_', '5', '_', '3', '8', '_', '_'},
           {'4', '1', '8', '_', '2', '_', '_', '6', '5'},
        };

        boolean ans = solveSudoku(board, r, c-1);

        if(ans) {
            for(char i = 0; i < r; i++){
                for(char j = 0; j < c; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid!!");
        }
    }
}