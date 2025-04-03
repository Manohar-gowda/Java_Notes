class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    public static Node head;
    public static void main(String[] args) {
        push(3);
        push(5);
        push(2);
        push(7);

        System.out.println(pop());
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop() {
        if(isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public static void printLink() {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}