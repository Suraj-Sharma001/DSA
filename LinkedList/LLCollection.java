import java.util.*;
public class LLCollection {
    public static void main(String[] args) {

        // Formation of LinkedList
        LinkedList<String> list = new LinkedList<String>();

        //Insertion in LinkedList
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);  // To print
        System.out.println(list.size());   // To print the size of list

        // To print the LinkedList
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("Null");

        // Searching in LinkedList
        // if(list.get(i) == value)

        // Deletion in LinkedList
        // list.removeFirst();
        // list.removeLast();

        list.remove(3);   // To remove an element of any index
        System.out.println(list);
    }
}