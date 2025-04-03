
public class Main {
    public static void main(String[] args) {
        treeImp tree = new treeImp();
        tree.insert(8);
        tree.insert(7);
        tree.insert(3);
        tree.insert(2);
        tree.insert(9);
        tree.insert(13);
        tree.insert(10);

//        tree.inorder();
//          boolean res = tree.breadthFirst(2);
//          if(res) {
//              System.out.println("Value found");
//          } else {
//              System.out.println("Not found");
//          }
        tree.sum();
    }
}