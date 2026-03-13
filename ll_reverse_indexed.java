public class ll_reverse_indexed {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head, int l, int r) {
        Node dummy = new Node(0);
        if (l == r || head == null || head.next == null || l > r || l < 1)
            return head;
        dummy.next = head;
        Node cur = dummy;
        for (int i = 0; i < l - 1; i++)
            cur = cur.next;
        Node N_1 = cur, N_0 = cur.next, prev = cur.next;
        cur = cur.next.next;
        Node after = cur.next;
        // System.out.println(N_1.data + " " + N_0.data + " " + prev.data + " " +
        // cur.data + " " + after.data);
        for (int i = 0; i < r - l; i++) {
            cur.next = prev;
            prev = cur;
            cur = after;
            if (after != null)
                after = after.next;
            // System.out.println(i + "inside loop" + prev.data + " " + cur.data + " " +
            // after.data);
        }
        N_0.next = cur;
        N_1.next = prev;
        return dummy.next;

    }

    public static void main(String[] args) {
        ll_reverse_indexed ll = new ll_reverse_indexed();
        ll.head = ll.new Node(1);
        // ll.head.next = ll.new Node(2);
        // ll.head.next.next = ll.new Node(3);
        // ll.head.next.next.next = ll.new Node(4);
        // ll.head.next.next.next.next = ll.new Node(5);
        ll.head = ll.reverse(ll.head, 1, 1);
        Node cur = ll.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

    }
}