import java.util.*;

public class create {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        if(st.contains(2)) {
            System.out.println("True");
        }
        if(!st.contains(5)) {
            System.out.println("False");
        }
        st.add(3);
        st.add(4);
        st.add(4);
        System.out.println(st.size());
        System.out.println(st);
        st.remove(3);
        System.out.println(st);
        st.add(1);
        st.add(3);

        // terator in Hashset
        Iterator it = st.iterator();
        // System.out.println(it.next());
        // System.out.println(it.hasNext());

        

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
