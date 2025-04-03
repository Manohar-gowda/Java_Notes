import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class invertBinartTree226 {
    public static void main(String[] args) {
        Node tree1 = new Node(4);
        tree1.left = new Node(2);
        tree1.right = new Node(7);
        tree1.left.left = new Node(1);
        tree1.left.right = new Node(3);
        tree1.right.left = new Node(6);
        tree1.right.right = new Node(9);

        printBreadth(invertTree(tree1));

    }

    public static Node invertTree(Node root) {
        if(root == null) {
            return null;
        }

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void printBreadth(Node tree) {
        Queue<Node> qu = new LinkedList<>();
        qu.offer(tree);
        while(!qu.isEmpty()) {
            Node curr = qu.remove();
            System.out.println(curr.val);
            if(curr.left!= null) {
                qu.offer(curr.left);
            }
            if(curr.right!=null) {
                qu.offer(curr.right);
            }
        }
    }

    public static void printDepth(Node tree) {
        Stack<Node> st = new Stack<>();
        st.push(tree);
        while(!st.isEmpty()) {
            Node curr = st.pop();
            System.out.println(curr.val);

            if(curr.right != null) {
                st.push(curr.right);
            }
            if(curr.left != null) {
                st.push(curr.left);
            }
        }
    }

}
