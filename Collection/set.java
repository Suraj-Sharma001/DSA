package Collection;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();

        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(40);
        st.add(40);
        System.out.println(st);
        st.remove(40);
        System.out.println(st);
        System.out.println(st.contains(20));

        // if i want to maintain the order i will use linkedHash set
        Set<Integer> st2 = new LinkedHashSet<>();
        st2.add(40);
        st2.add(10);
        st2.add(20);
        st2.add(20);
        st2.add(30);
        st2.add(40);
        st2.add(40);
        st2.add(40);
        System.out.println(st2);

        // if i want to maintain the order in sorted from will use linkedHash set
        Set<Integer> st3 = new TreeSet<>();
        st3.add(40);
        st3.add(10);
        st3.add(20);
        st3.add(20);
        st3.add(30);
        st3.add(40);
        st3.add(40);
        st3.add(40);
        System.out.println(st3);
    }
}
