class linkedlist {
    Node head;

    class Node {
        int data;
        Node next;
    }

    public static void main(String args[]) {
        linkedlist list = new linkedlist();
        // Node head = null;
        list.head = list.new Node();
        list.head.data = 1;
        list.head.next = null;

        Node second = list.new Node();
        second.data = 2;
        second.next = null;
        list.head.next = second;

        Node third = list.new Node();
        third.data = 3;
        third.next = null;
        second.next = third;
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);

    }

}
