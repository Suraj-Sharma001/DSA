package Generics;

public class test1 {

//    public static class Print {
//        Integer num;
//
//        public Print(Integer num) {
//            this.num = num;
//        }
//
//        public void put() {
//            System.out.println(num);
//        }
//    }

    public static class Print <T> {  // T represent the type of obj containing print class
        T num;

        public Print(T num) {
            this.num = num;
        }

        public void put() {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Print<Integer> n1 = new Print<>(10);
        n1.put();
        Print<Double> n2 = new Print<>(10.0064);
        n2.put();
        Print<String> n3 = new Print<>("Suraj Sharma");
        n3.put();
    }
}
