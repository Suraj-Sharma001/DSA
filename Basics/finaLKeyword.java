package Basics;

class Demo {
    static int staticKeyword = 10;
    int nonStatic = 20;

    public static void staticK() {
        System.out.print("Static: " + staticKeyword);
    }

    public void nonStaticK() {
        System.out.print("Static: " + nonStatic);
    }
}


public class finaLKeyword {
    public static void main(String[] args) {

        Demo.staticK();

        Demo d1 = new Demo();
        d1.nonStaticK();
//        int x = 10;
//        int y = 20;
//
//        int sum = findSum(x, y);
//        System.out.print(sum);
//    }
//
//    static int findSum(int a, int b) {
//        return a+b;
    }
}
