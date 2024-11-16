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

public class DeletionDLL {
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

    private static Node deleteHead(Node head) {
        if(head == null || head.next == null) {
            System.out.println("list is empty");
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

     private static Node deleteTail(Node head) {
            if(head == null || head.next == null) {
                System.out.println("list is empty");
            }
            Node tail = head;
            while(tail.next != null) {
                tail = tail.next;
            }
            Node newTail = tail.back;
            tail.back = null;
            newTail.next = null;
            return head;
        }

        private static Node deleteKth(Node head, int k) {
            if(head == null) {
                return null;
            }
            Node curr = head;
            int count = 0;
            while(curr != null) {
                count++;
                if(count == k) {
                    break;
                }
                curr = curr.next;
            } 
            Node prev = curr.back;
            Node front = curr.next;

            if(prev == null && front == null) {
                return null;
            } else if(prev == null) {
               return  deleteHead(head);
            } else if(front == null) {
                return deleteTail(head);
            }

                prev.next = front;
                front.back = prev;
                curr.next = null;
                curr.back = null;
                 return head;
            }

        
        

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8 };
        Node head = convertArr(arr);
        print(head);
        //head = deleteHead(head);
        //print(head);
        // head = deleteTail(head);
        // print(head);
        // deleteKth(head, 2);
        // print(head);

    }
}