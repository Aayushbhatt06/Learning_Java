
public class LC_61 {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {

        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) {
                return head;
            }
            ListNode c = head;
            int size = 1;
            while (c.next != null) {
                size++;
                c = c.next;
            }
            c.next = head;
            k = k % size;
            int steps = size - k;
            ListNode newTail = c;
            c = head;
            for (int i = 0; i < steps; i++) {
                newTail = c;
                c = c.next;
            }
            newTail.next = null;
            return c;
        }
    }

}
