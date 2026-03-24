
import java.util.PriorityQueue;

class LC_23 {

    // LinkedList based approach
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (true) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    min = lists[i].val;
                    idx = i;
                }
            }
            if (idx == -1) {
                break;
            }
            tail.next = new ListNode(min);
            tail = tail.next;
            lists[idx] = lists[idx].next;
        }

        return dummy.next;
    }

    //Priority queue Approach (Heaps)
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                pq.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (!pq.isEmpty()) {
            tail.next = new ListNode(pq.poll());
            tail = tail.next;
        }
        return dummy.next;
    }
}
