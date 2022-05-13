public class MyLinkedList {
    Node head;
    Node tail;

    MyLinkedList(String value) {
        add(value);
    }

    public void add(String value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current = new Node(value);
        tail = current;
    }
}
