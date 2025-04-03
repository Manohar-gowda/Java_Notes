import java.util.*;

class Node{
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right= null;
    }
}

class BinaryTree {
    static Node root;

    public static void insert(int data) {
        root = insertRec(root, data);
    }

    public static Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data <= root.data) {
            root.left = insertRec(root.left, data);
        }else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public static void BreadthSearch() {    // level order traversal
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()) {
            Node curr = qu.remove();
            list.add(curr.data);
            if (curr.left != null) qu.offer(curr.left);
            if (curr.right != null) qu.offer(curr.right);
        }
        System.out.println(list);
    }

    public static void DepthFirstSearch() {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            Node curr = st.pop();
            list.add(curr.data);
            if (curr.right != null) st.push(curr.right);
            if (curr.left != null) st.push(curr.left);
        }
        System.out.println(list);
    }

}


public class treeTravel {
    public static void main(String[] args) {

        BinaryTree.insert(8);
        BinaryTree.insert(7);
        BinaryTree.insert(6);
        BinaryTree.insert(2);
        BinaryTree.insert(15);
        BinaryTree.insert(11);

       BinaryTree.BreadthSearch();
       BinaryTree.DepthFirstSearch();
    }
}
