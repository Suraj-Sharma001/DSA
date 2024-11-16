import java.util.*;
public class SumOfSeries {

    public static int printSum(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n%2 == 0)
        {
            return printSum(n-1)-n;
        }
        else
        {
            return printSum(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
}
