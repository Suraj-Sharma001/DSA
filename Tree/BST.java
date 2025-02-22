package Tree;

import java.util.Scanner;

class BST {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static void input(Node root, Scanner sc){
        int data = sc.nextInt();
        while (data != -1){
            //root = createBST(root, data);
            data = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        input(root, sc);

    }
}
