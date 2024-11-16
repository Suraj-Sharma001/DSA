package Tree;

public class hightOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int hight(Node root){
        if(root == null) return 0;
        int leftHight = hight(root.left);
        int rightHight = hight(root.right);
        return Math.max(leftHight, rightHight)+1;
    }

    // hight in TC - O(n^2)
    public static int diameter(Node root){
        if(root == null) return 0;
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = hight(root.left) + hight(root.right) + 1;
        return Math.max(dia1, Math.max(dia2, dia3));
    }
    // hight in TC - O(n)

    static class TreeInfo {
        int hight;
        int dia;

        TreeInfo(int hight, int dia){
            this.hight = hight;
            this.dia = dia;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1,3,-1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        int Totalhight = hight(root);
        System.out.println(Totalhight);
        int totalDia = diameter(root);
        System.out.println(totalDia);
    }
}
