
import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> queue = new LinkedList<>();
    private int len = 0;

    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        while (!queue.isEmpty()) {
            temp.offer(queue.poll());
        }
        queue.offer(x);
        while (!temp.isEmpty()) {
            queue.offer(temp.poll());
        }
        len += 1;
    }

    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        len -= 1;
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
