public class lowestcommonAscester236 {
    public static void main(String[] args) {
         Node tree1 = new Node(6);
         tree1.left = new Node(2);
         tree1.right = new Node(8);
         tree1.left.left = new Node(0);
         tree1.left.right = new Node(4);
         tree1.left.right.left = new Node(3);
         tree1.left.right.right = new Node(5);
         tree1.right.left = new Node(7);
         tree1.right.right = new Node(9);

        System.out.println((lowestCommonAncestor(tree1,tree1.left.left,tree1.right.left)).val);

    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);

        if(left == null) {
            return right;
        }
        if(right == null) {
            return left;
        }

        return root;
    }

}
