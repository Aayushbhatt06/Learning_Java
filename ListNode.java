
// Definition for singly-linked list.
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

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = mid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public ListNode mid(ListNode h) {
        ListNode s = h;
        ListNode f = h;
        ListNode prev = null;
        while (f != null && f.next != null) {
            prev = s;
            s = s.next;
            f = f.next.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        return s;
    }

    public ListNode merge(ListNode l, ListNode r) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l != null && r != null) {
            if (l.val < r.val) {
                tail.next = l;
                l = l.next;
            } else {
                tail.next = r;
                r = r.next;
            }
            tail = tail.next;
        }

        if (l != null) {
            tail.next = l;
        }
        if (r != null) {
            tail.next = r;
        }

        return dummy.next;
    }
}
