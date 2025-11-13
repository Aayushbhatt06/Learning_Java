
import java.util.Scanner;

class BinaryTrees {

    public BinaryTrees() {

    }

    public class Node {

        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
    Node root;

    public void populate(Scanner sc) {
        System.out.println("Enter root Node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Wnat to enter at the left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the number to be inserted");
            int l = sc.nextInt();
            node.left = new Node(l);
            populate(sc, node.left);
        }
        System.out.println("want to enter at the right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the number to be inserted");
            int r = sc.nextInt();
            node.right = new Node(r);
            populate(sc, node.right);
        }

    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void display() {
        display(root, "");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTrees bt = new BinaryTrees();
        bt.populate(sc);
        bt.prettyDisplay();
    }
}
