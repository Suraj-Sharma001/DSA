package String;

import java.util.Arrays;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        String name = "Suraj";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));

        System.out.println(name.split("r"));
    }
}
