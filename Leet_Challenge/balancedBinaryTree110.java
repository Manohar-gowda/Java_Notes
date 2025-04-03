public class balancedBinaryTree110 {
    public static void main(String[] args) {
        Node tree1 = new Node(3);
        tree1.left = new Node(9);
        tree1.right = new Node(20);
        tree1.right.left = new Node(15);
        tree1.right.right = new Node(7);

        Node tree2 = new Node();
        System.out.println( isBalanced(tree1));

    }

    public static boolean isBalanced(Node root) {
       if(root == null) {
           return true;
       }
        return Math.abs(Depth(root.left) - Depth(root.right)) <= 1;
    }

    public static int Depth(Node root) {
        if(root == null) {
            return 0;
        }
        return Math.max(Depth(root.left),Depth(root.right)) + 1;
    }
}
