package LinkedList;

public class LinkedList1 {
   public static Node head;

    // creation a ll
    public static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add---> first
    public void addFirst(String data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        // step 3 - base case or if empty ll
        if(head == null) {
            head = newNode;
            return;
        }
        // step 2 - newNode next - Head
        newNode.next = head;
        head = newNode;
    }

    // Add---> last
    public void addLast(String string) {
        // step 1 - create new node
         Node newNode = new Node(string);
         // step 3 - base case or if empty ll
         if(head == null) {
            head = newNode;
            return;
    }
    // step 2 - tail ka next or curr node = new node
    Node currNode = head;
    while(currNode.next != null) {
        currNode = currNode.next;
    }
    currNode.next = newNode;
}

// To print 
public void printList() {
    if(head == null) {
        System.out.println("List is Empty");
    }
    Node currNode = head;
    while(currNode != null) {
        System.out.print(currNode.data + " --> ");
        currNode = currNode.next;
    }
    System.out.println("Null");
}

// Deletion --> First
public void deleteFirst() {
    if(head == null) {
        System.out.println("The list is empty");
        return;
    }
    head = head.next;
}

// Deletion --> Last
public void deleteLast() {
     if(head == null || head.next == null) {
        System.out.println("The list is empty");
        return;
    } 

    Node secondLast = head;
    Node lastNode = head.next;   // head.next = null -> lastNode = null
    while(lastNode.next != null) {  //null.next = ERROR
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }
    secondLast.next = null;
}

// search using loop
public int search(String key) {
Node temp = head;
int i = 0;
while(temp != null) {
    if(temp.data == key) {  // key found
        return i;
    }
    temp = temp.next;
    i++;
}
    return -1;

}

// reverse ll
public Node reverseList() {
    Node prevNode = null;
    Node currNode = head;
    if(head == null || head.next == null) {
        return head;
    }
    while(currNode != null) {
        Node nextNode = currNode.next;
        currNode.next = prevNode;
        // update
        prevNode = currNode;
        currNode = nextNode;
    }
    head = prevNode;
    return head;
}

// Main function--->
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("This");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();
        list.addLast("This");
         list.addLast("is");
          list.addLast("a");
           list.addLast("list");

        list.printList();
        list.reverseList();
        list.printList();
    

       // System.out.println(list.search("a"));
        // list.printList();
    }
}