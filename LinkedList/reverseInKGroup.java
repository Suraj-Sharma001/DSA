package LinkedList;

import java.util.Scanner;

public class reverseInKGroup {

    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addNode(Node head, int val) {
        Node nn = new Node(val);
        if(head == null) {
            head = nn;
            return head;
        }
        nn.next = head;
        head = nn;
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static Node reverseNodeInKGroup(Node head, int k) {

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        head = addNode(head, 50);
        head = addNode(head, 40);
        head = addNode(head, 30);
        head = addNode(head, 20);
        head = addNode(head, 10);
        Node ans = reverseNodeInKGroup(head, k);
        printList(ans);
    }
}
