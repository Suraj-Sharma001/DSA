import java.util.*;
public class Fibbonachi {

    public static int printFibbo(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        // int prev = printFibbo(n-1);
        // int prepre = printFibbo(n-2);
        // int fib = prev+prepre;
        return printFibbo(n-1)+printFibbo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = printFibbo(n);
        System.out.println(fib);
    }
}
