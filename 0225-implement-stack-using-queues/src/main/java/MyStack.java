import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> in = new LinkedList<>();
    Queue<Integer> out = new LinkedList<>();
    // Push element x onto stack.
    public void push(int x) {
        if (!out.isEmpty())
            in.add(out.poll());
        in.add(x);

    }

    // Removes the element on top of the stack.
    public void pop() {
        if (out.isEmpty()) {
            transfer(in, out);
            Queue<Integer> t = in;
            in = out;
            out = t;
        }
       out.poll();
    }

    // Get the top element.
    public int top() {
        if (out.isEmpty()) {
            transfer(in, out);
            Queue<Integer> t = in;
            in = out;
            out = t;
        }
        return out.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void transfer(Queue<Integer> in, Queue<Integer> out) {
        int n = in.size();
        for (int i = 0; i < n - 1; i++) {
            out.add(in.poll());
        }
    }
}