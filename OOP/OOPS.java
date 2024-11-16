import java.util.Scanner;
public class OOPS {

       public static void main(String[] args) {
        // Student x = new Student();  // decleration

        // value initialization
        //  x.name = "Suraj";
        // x.Rno = 77;
        // x.persent = 80.096;


        // System.out.println(x.getRno());
        // x.setRno(70);
        // System.out.println(x.getRno());



        // CONSTRUCTER
        //Student x = new Student("Suraj", 19, 99.076);
        // System.out.println(x.name);
        // System.out.println(x.Rno);
        // System.out.println(x.persent);

        // final keyword
        // x.scl = "GEU";
        // System.out.println(x.scl);

        // Static keyword
        Student x = new Student("Suraj", 19, 99.076);
        System.out.println(x.noOfStudent);
        Student x1 = new Student("Sura", 1, 99.0);
        System.out.println(x1.noOfStudent);

    }
}