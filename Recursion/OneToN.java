import java.util.*;
public class OneToN {

    public static void printseries(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        printseries(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printseries(n);
    }
}
