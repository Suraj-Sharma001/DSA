public class constructor {

    public static class Person {
        int age;
        String name;

        // constructor --> w/o parameters
        Person() {
            // <----->
        }

        // constructor --> with parameters
        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // using default constructor --> java provide default constructor
        Person p1 = new Person();
        p1.age = 18;
        p1.name = "John";

        // using peramiterized constructor
        Person p2 = new Person(20, "Suraj");
        System.out.println(p2);
    }
}
