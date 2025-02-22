package String;

public class string02 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);
        System.out.println(a.equals(b)); // method to check comperision

        String x = new String("Karan");
        String y = new String("Karan");
        System.out.println(x == y);

        // formetted console input output using printf
        System.out.printf("Value of 22/7 is : %2f\n", 22.0/7.0);

        String name = "Suraj Sharma";
        int age = 20;
        System.out.printf("My name is %s and my age is %d.\n", name, age);


        }
    }
