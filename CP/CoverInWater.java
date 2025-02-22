package CP;

import java.util.Scanner;

public class CoverInWater {

    public static int solve(int n, String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == '.' && i+1 < n && arr[i+1] == '.' && i+2 < n && arr[i+2] == '.') {
                return 2;
            } else {
                if(arr[i] == '.') {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = solve(n,s);
            System.out.println(ans);
        }
    }
}
