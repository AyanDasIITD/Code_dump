public class reverse_linkedlist {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode A) {
        if (A == null)
            return A;
        ListNode prev = null, cur = A, after = A.next;
        while (after != null) {
            // if(prev!=null)
            // prev.next=null;
            cur.next = prev;
            prev = cur;
            cur = after;
            after = after.next;
        }
        cur.next = prev;
        return cur;
    }

    public static void main(String args[]) {
        reverse_linkedlist list = new reverse_linkedlist();
        ListNode head = null;
        head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);
        head.next.next.next = list.new ListNode(4);
        head.next.next.next.next = list.new ListNode(5);
        ListNode reversed = list.reverseList(head);
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}
