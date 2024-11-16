public class obj{

    public static class Person{
        int age;
        String name;

        void fun(){
            System.out.println("Hii");
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Suraj";
        p1.fun();
        Person p2 = new Person();
        p2.age = 18;
        p2.name = "Hari";
        p2.fun();
        System.out.println(p1.name);
    }
}
