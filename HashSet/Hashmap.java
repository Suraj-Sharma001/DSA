package HashSet;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("USA", 40);
        map.put("China", 135);
        System.out.println(map);
        map.put("China", 138);
        System.out.println(map);

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Japan"));
        System.out.println(map.get("India"));
        System.out.println(map.get("Japan"));

       for(Map.Entry<String, Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
       }
    }
}
