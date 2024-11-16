package  LinkedList;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }

}

public class ReverseDLL {
    public static Node head;

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "-->" );
            head = head.next;
        }
        System.out.println("null");
    }

    private static Node convertArr(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node reverseDLL(Node head) {
        if(head == null) return head;
        Node curr = head;
        Node prev = null;
        while(curr != null) {
            prev = curr.back;
            curr.back = curr.next;
            curr.next = prev;

            curr = curr.back;  
        }
        return prev.back;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8 };
        Node head = convertArr(arr);
        print(head);
        Node newHead =  reverseDLL(head);
        print(newHead);
    }
}
