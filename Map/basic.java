package Map;

import java.util.HashMap;
import java.util.Map;

public class basic {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();  // key-value pair

        // add value
        mp.put(19, "Suraj");
        mp.put(17, "Paras");
        mp.put(16, "Luv");
        mp.put(20, "Ritik");
        mp.put(10, "Karan");

        // get the value
        System.out.println(mp.get(20));

        // update the value
        mp.put(20, "Karan");
        System.out.println(mp);

        // remove the key value pair
        mp.remove(16);
        System.out.println(mp);

        // check key if exist or not
        System.out.println(mp.containsKey(20));

        // check value if exist or not
        System.out.println(mp.containsValue("Suraj"));

        // provide all the keys
        System.out.println(mp.keySet());

        // provide all the values
        System.out.println(mp.values());

        // provide key-values pair
        System.out.println(mp.entrySet());

        System.out.println();

        // traverse in map -> keys
        for(Integer key : mp.keySet()){
            System.out.println(key);
        }

        System.out.println();

        // traverse in map -> values
        for(String val : mp.values()){
            System.out.println(val);
        }

        System.out.println();
        // traverse in map -> key-values
        for(Map.Entry<Integer, String> e : mp.entrySet()) {
            System.out.println(e);
        }
        System.out.println();
        // OR
        for(var e : mp.entrySet()) {
            System.out.println(e);
        }
    }
}
