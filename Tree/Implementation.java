package Tree;

import java.util.Scanner;

public class Implementation {
    private static class Node {
        private int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    // insert element
    public void populate(Scanner sc){
        System.out.println("Enter the root node -");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter the left of " + node.value);
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Enter the value of left of " + node.value);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter the right of " + node.value);
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.println("Enter the value of right of " + node.value);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }

    private void display(Node node, String iden){
        if(node == null) return;
        System.out.println(iden + node.value);
        display(node.left, iden + "\t");
        display(node.right, iden + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Implementation tree = new Implementation();
        tree.populate(sc);
        tree.display();
    }
}
