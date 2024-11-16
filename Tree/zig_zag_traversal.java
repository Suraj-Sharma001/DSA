package Tree;

import java.lang.reflect.Array;
import java.util.*;

public class zig_zag_traversal {
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

    public static ArrayList<ArrayList<Integer>> zig_Zag_Travers(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        boolean falg = true;
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                Node node = q.poll();

                if(falg == true){
                    temp.add(node.data);
                } else {
                    temp.add(0, node.data);
                }

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            falg = !falg;
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1,3,-1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = zig_Zag_Travers(root);
        System.out.println(ans);
    }
}
