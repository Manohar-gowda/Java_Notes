
class node {
    int data;
    node next;
    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedlistOp {
     public node head;
     public node tail;
     public int size = 0;

    public void insertAtEnd(int data) {
       node newNode = new node(data);
       if(head == null) {
           head = newNode;
       }else {
           node temp = head;
           while(temp.next != null) {
               temp = temp.next;
           }
           temp.next = newNode;
       }
    }
    //08277892004

    public void insertAt(int index, int data) {
        node newNode = new node(data);
        node curr = head;
        int count = 1;
        node next = null;
        if(head == null)
        {
            head = newNode;
        } else {
            while(curr.next != null) {
                if(count == index) {
                   next = curr.next;
                   curr.next = newNode;
                }
                curr = curr.next;
                count++;
            }
            curr.next = next;
        }
    }

    public void reverse() {
        node curr = head;
        node prev = null;
        while(curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void loopCreate(int pos) {
        if(head == null) return;
        node curr = head;
        node loopNode = null;
        int count = 1;
        while(curr.next != null) {
            if(count == pos) {
                loopNode = curr;
            }
            curr = curr.next;
            count++;
        }
        curr.next = loopNode;
    }

    public void display(node s) {
        node current = s;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println(size);
    }

    public void displayRec(node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data + "->");
        displayRec(head.next);
    }

    public void findMiddleNode() {
        node fastP = head;
        node slowP = head;
    if(size % 2 == 0) {
        while (fastP != null && slowP != null) {
            fastP = fastP.next.next;
            slowP = slowP.next;
        }
    } else {
        while (fastP != null && fastP.next != null) {
            fastP = fastP.next.next;
            slowP = slowP.next;
        }
    }
        System.out.println(slowP.data);
    }

    public void sum() {
        int sum = 0;
        node curr = head;
        if(curr == null) System.out.println(0);
        while(curr != null) {
            sum += curr.data;
            curr = curr.next;
        }
        System.out.println(sum);
    }

    public void valueAt(int index) {
        node curr = head;
        if(curr == null) return;
        while(index > 0) {
            curr = curr.next;
            index--;
        }
        System.out.println(curr.data);
    }

    public void removeDupli() {
        node curr = head;

        while(curr.next != null && curr != null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

    public node merge(node li1, node li2) {
        node dummy = new node(0);
        node curr = dummy;

        while(li1 != null && li2 != null) {
            if(li1.data < li2.data) {
                curr.next = li1;
                li1 = li1.next;
            } else {
                curr.next = li2;
                li2 = li2.next;
            }
            curr = curr.next;
        }
        if(li1 != null) {
            curr.next = li1;
        } else {
            curr.next = li2;
        }
        return dummy.next;
    }

    public node KthFromLast(int k) {
        node f = head;
        node s = head;

        for(int i=0;i<k;i++) {
            if(f == null) return null;
            f = f.next;
        }
        while(f != null) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public void addNode(int data) {
        node newNode = new node(data);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void findCycle(node s) {
        node fastP = s;
        node slowP = s;

        while(slowP != null && fastP.next != null) {
            fastP = fastP.next.next;
            slowP = slowP.next;
            if(slowP == fastP) {
                System.out.println("we have loop at node " + slowP.data);
                return;
            }
        }

    }
}

public class Main {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(3);
        node c = new node(5);
        node d = new node(6);
        a.next = b;
        b.next = c;
        c.next = d;

        a.next.next.next = a.next;

//        node w = new node(1);
//        node x = new node(2);
//        node y = new node(9);
//        node z = new node(14);
//        w.next = x;
//        x.next = y;
//        y.next = z;


        LinkedlistOp op = new LinkedlistOp();
//        op.addNode(1);
//        op.addNode(1);
//        op.addNode(2);
//        op.addNode(3);
//        op.addNode(3);
//        op.addNode(5);
//        op.addNode(8);
//        op.addNode(9);
//        op.addNode(12);
//        op.addNode(13);
//        op.addNode(14);
//        op.addNode(15);

        op.findCycle(a);

    }
}