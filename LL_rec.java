
public class LL_rec {

    private Node head = null;
    private Node tail = null;
    private int size;

    public LL_rec() {
        this.size = 0;
    }

    private class Node {

        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertRec(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }
        head = insertRecHelper(index, val, head);
        size++;
    }

    private Node insertRecHelper(int index, int val, Node node) {
        if (index == 0) {
            return new Node(node, val);
        }
        node.next = insertRecHelper(index - 1, val, node.next);
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteIndex(int i) {
        if (head == null) {
            return;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node temp = dummy;
        for (int j = 0; j < i; j++) {
            if (temp.next == null) {
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        head = dummy.next;
    }

    public void deleteVal(int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node temp = dummy;
        while (temp.next != null) {
            if (temp.next.val == n) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        head = dummy.next;
    }

    public static void main(String[] args) {
        LL_rec list = new LL_rec();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.print("Before recursive insert: ");
        list.display();

        list.insertRec(3, 9);

        System.out.print("After recursive insert: ");
        list.display();
    }
}
