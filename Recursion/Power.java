import java.util.*;

public class Power {

    public static int XPowN(int x, int n) {
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        // return XPowN(x, n-1)*x;   // stack hight n



        //stack hight log(n)
        if(n%2 ==0)
        {
        int small_pow = XPowN(x, n/2);
        return small_pow*small_pow;
        }
        else
        {
           int small_pow = XPowN(x, n/2);
           return x*small_pow*small_pow;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(XPowN(x, n));
    }    
}
