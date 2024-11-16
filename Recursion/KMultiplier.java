import java.util.*;
public class KMultiplier {

    public static void printMultiplier(int n, int k) {
        if(k==0) {
            
            return;
        }
        printMultiplier(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMultiplier(n, k);
    }
}
