public class sameTree100 {
    public static void main(String[] args) {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);
        tree1.right.left = new Node(4);
        tree1.right.right = new Node(5);

        Node tree2 = new Node(1);
        tree2.left = new Node(2);
        tree2.right = new Node(3);
        tree2.right.left = new Node(8);
        tree2.right.right = new Node(5);

        System.out.println(isSameTree(tree1, tree2));

    }

    public static boolean isSameTree(Node p, Node q) {
        if(p==null || q==null){
            return (p==q);
        }
        return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
