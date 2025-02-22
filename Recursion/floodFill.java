package Recursion;

import java.util.Scanner;

public class floodFill {

    public static void flood_Fill(int[][] arr, int row, int col, String anf, boolean[][] vis) {
        if(row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 1 || vis[row][col]) {
            return;
        }

        if(row == arr.length-1 && col == arr[0].length-1) {
            System.out.print(anf);
            return;
        }

        vis[row][col] = true;

        flood_Fill(arr, row-1, col, anf+"t", vis);
        flood_Fill(arr, row, col-1, anf+"l", vis);
        flood_Fill(arr, row+1, col, anf+"d", vis);
        flood_Fill(arr, row, col+1, anf+"r", vis);
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] maze = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        String asf = "";
        boolean[][] visited = new boolean[n][m];
        flood_Fill(maze, 0, 0, asf, visited);
    }
}
