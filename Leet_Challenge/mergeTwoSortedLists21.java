class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
  }

public class mergeTwoSortedLists21 {
    public static void main(String[] args) {
        ListNode ls1 = new ListNode(1);
        ls1.next = new ListNode(2);
        ls1.next.next = new ListNode(4);

        ListNode ls2 = new ListNode(1);
        ls2.next = new ListNode(3);
        ls2.next.next = new ListNode(4);
        ls2.next.next.next = null;

        print(merge(ls1,ls2));
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            }else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1!=null) {
            curr.next = list1;
        }else {
            dummy.next = list2;
        }

        return dummy.next;
    }

    public static void print(ListNode list) {
        ListNode curr = list;
        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
