public class LL_rec {

    private Node head = null;
    private Node tail = null;
    private int size;

    public LL_rec() {
        this.size = 0;
    }

    // Node class
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

    // Insert at the end (iterative)
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

    // Recursive insert at given index (0-based index)
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

    // Display function
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL_rec list = new LL_rec();

        // Insert normally at end
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.print("Before recursive insert: ");
        list.display();

        // Insert recursively at index 3 (0-based indexing)
        list.insertRec(3, 9);

        System.out.print("After recursive insert: ");
        list.display();
    }
}
