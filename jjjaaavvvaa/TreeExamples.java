public class TreeExamples {
    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(10);
        tree1.left = new TreeNode(5);
        tree1.right = new TreeNode(15);
        tree1.left.left = new TreeNode(3);
        tree1.left.right = new TreeNode(7);
        tree1.right.right = new TreeNode(18);

        int[] path = new int[1000];
        printPathsRec(tree1, path, 0);

    }

//    public static void printPaths(TreeNode node) {
//        int[] path = new int[1000];
//        printPathsRec(node, path, 0);
//    }

    public static void printPathsRec(TreeNode node, int[] path, int pathLength) {
        if(node == null) {
            return;
        }

        path[pathLength] = node.data;
        pathLength++;

        if (node.left == null && node.right == null) {
            printPath(path, pathLength);
        } else {
            printPathsRec(node.left, path, pathLength);
            printPathsRec(node.right, path, pathLength);
        }
    }

    public static void printPath(int[] path, int pathLength) {

        for (int i=0;i<pathLength;i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }
 }

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}


