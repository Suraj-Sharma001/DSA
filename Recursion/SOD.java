import java.util.*;

public class SOD {

    public static int SumOfDigit(int n) {
        if(n>=0 && n<=9)
        {
            return n;
        }
        return SumOfDigit(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(SumOfDigit(12345));
    }
}