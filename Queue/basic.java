package Queue;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        Stack<Integer> stack = new Stack<>();
        q.add(10);
        System.out.println(q);
        q.add(20);
        System.out.println(q);
        q.add(30);
        System.out.println(q);
        q.remove();
        System.out.println(q);

        System.out.println(q.peek());
        
    }
}
