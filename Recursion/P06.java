import java.util.Scanner;

public class P06 {

    public static int printMul(int N){
        if(N==0) return 1;
        return N*printMul(N-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int mul = printMul(N);
        System.out.println(mul);
    }
}
