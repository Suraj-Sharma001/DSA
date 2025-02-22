package LinkedList;

import java.util.*;

public class RemoveCycle {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;  // +1
            fast = fast.next.next; // +2
            if(slow == fast) {
                return true;
            }  
        }
        return false;
    }

    public static void deleteCycle() {
        // detect cycle
        boolean cycle = false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // meeting point;
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next =  head.next;
        System.out.println(isCycle());
        deleteCycle();
        System.out.println(isCycle());
    }
}
