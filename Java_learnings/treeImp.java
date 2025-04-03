import java.awt.*;
import java.util.*;

class  Node {
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class treeImp {
    Node root;
    public void insert(int data) {
        root = insertRec(root,data);
    }
    public Node insertRec(Node root,int data) {
        if(root == null)
            root = new Node(data);
        else if (data < root.data)
            root.left = insertRec(root.left,data);
        else if (data > root.data)
            root.right = insertRec(root.right,data);
        return root;
    }

    public void inorder() {
        inOrderRec(root);
    }
    public void inOrderRec(Node root) {
        if(root == null) {
            return;
        }

        inOrderRec(root.left);
        System.out.print(root.data + " ");
        inOrderRec(root.right);
    }


    public void depthFirst() {
            if (root == null) return;
        ArrayList<Integer> li = new ArrayList<>();
            Stack<Node> st = new Stack<>();
            st.push(root);

            while (!st.empty()) {
                Node curr = st.pop();
                li.add(curr.data);

                if (curr.right != null) {
                    st.push(curr.right);
                }
                if (curr.left != null) {
                    st.push(curr.left);
                }
            }
            System.out.println(li);
    }

    public boolean breadthFirst(int n) {
        if(root == null) return false;
        Queue<Node> qu = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        qu.offer(root);

        while(!qu.isEmpty()) {
            Node curr = qu.remove();
            if(curr.data == n) {
                return true;
            }
            list.add(curr.data);
            if(curr.left != null) {
                qu.offer(curr.left);
            }
            if(curr.right != null) {
                qu.offer(curr.right);
            }

        }
        System.out.println(list);
        return false;
    }

    public void sum1() {
        if(root == null) return;
        int sum = 0;
        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()) {
            Node curr = qu.remove();
            sum += curr.data;

            if(curr.left != null) {
                qu.offer(curr.left);
            }
            if(curr.right != null) {
                qu.offer(curr.right);
            }
        }
        System.out.println(sum);
    }

    public void sum() {
        System.out.println(sum2(root));
    }

    public int sum2(Node root) {
        if(root == null) {
            return 0;
        }
        return root.data + sum2(root.left) + sum2(root.right);
    }
}
