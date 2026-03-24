
class BST {

    public class Node {

        private int value;
        private Node Right;
        private Node Left;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }
    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.Left = insert(value, node.Left);
        }
        if (value > node.value) {
            node.Right = insert(value, node.Right);
        }
        node.height = Math.max(height(node.Left), height(node.Right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void display() {
        display(this.root, "Root Node: ");

    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.Left, "Left child of " + node.value + " : ");
        display(node.Right, "Right child of " + node.value + " : ");

    }

}
