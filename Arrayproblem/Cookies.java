package Arrayproblem;
import java.util.*;

public class Cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of students: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of cookies ");
        int m = sc.nextInt();

        int g[] = new int[n];
        int c[] = new int[m];

        System.out.println("Enter the students: ");
        for(int i = 0; i<n; i++){
            g[i] = sc.nextInt();
        }

        System.out.println("Enter the cookies: ");
        for(int i = 0; i<m; i++){
            c[i] = sc.nextInt();
        }

        Arrays.sort(g);
        Arrays.sort(c);

        int i = 0;
        int j = 0;
        while(i < g.length && j < c.length) {
            if(g[i] <= c[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        System.out.println(i);
    }
}
