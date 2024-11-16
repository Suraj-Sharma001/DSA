import java.util.Scanner;

public class GCD {

    public static int printGCD(int x, int y) {

        // using recursion
        if(y==0)
        {
            return x;
        }
        return printGCD(y, x%y);

        // using iteration
        // while(x%y != 0)
        // {
        //     int rem = x%y;
        //     x = y;
        //     y = rem;
        // }
        // return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(printGCD(x, y));
    }
}
