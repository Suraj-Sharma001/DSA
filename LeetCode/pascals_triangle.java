import java.util.*;

class pascals_triangle {

    public static List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col=1; col < row; col++){
            ans = ans*(row-col);
            ans = ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=n; i++) { 
            ans.add(generateRow(i));    
        }
        System.out.println(ans);
    }
}