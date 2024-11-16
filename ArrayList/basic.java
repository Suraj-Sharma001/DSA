package ArrayList;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(2,30);

        list.set(0, 100);
        list.remove(1);
        list.remove(Integer.valueOf(2));

        System.out.println(list.contains(Integer.valueOf(3)));

     //   System.out.println(list.get(0));

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));;
        }
    }


}
