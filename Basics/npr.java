import java.util.Scanner;

public class npr {

    public static int Factorial(int x){
        int fact = 1;
        for(int i=1;i<=x;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter n");
        int n = sc.nextInt();
        System.err.println("Enter r");
        int r = sc.nextInt();

        int nfact = Factorial(n);
        int n_rfact = Factorial(n-r);
        int npr = nfact/n_rfact;

        System.out.println("Factorial to n and r is "+npr);
    }
}

