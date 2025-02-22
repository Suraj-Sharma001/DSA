package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Suraj");
        data.add("Paras");
        data.add("Karan");
        System.out.println(data);
        data.add(1, "Nayan");
        System.out.println(data);
        System.out.println(data.get(0));
        data.remove(1);
        System.out.println(data);
        data.set(0, "Suraj Sharma");
        System.out.println(data);
        System.out.println(data.contains("Paras"));

        for(String el : data) {
            System.out.println(data);
        }

        Iterator<String> it = data.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
