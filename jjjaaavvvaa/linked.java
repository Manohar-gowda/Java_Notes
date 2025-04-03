public class linked {
    public static void main(String[] args) {
//        Operations.insert(2);
//        Operations.insert(4);
//        Operations.insert(6);
//        Operations.insert(8);

        Node list1 = new Node(1);
        list1.next = new Node(1);
        list1.next.next = new Node(2);
        list1.next.next.next = new Node(3);
        list1.next.next.next.next = new Node(3);
        list1.next.next.next.next.next = new Node(4);
        list1.next.next.next.next.next.next = new Node(5);

        Operations.display(list1);

        list1 = Operations.removeDupli(list1);
        Operations.display(list1);

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
    }
}

class Operations {
//    static Node head;
    public static void display(Node list) {
        Node curr = list;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

//    public static void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node curr = head;
//            while (curr.next != null) {
//                curr = curr.next;
//            }
//            curr.next = newNode;
//        }

    public static Node removeDupli(Node list) {
        Node curr = list;
        while(curr != null && curr.next != null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        return list;
    }
}