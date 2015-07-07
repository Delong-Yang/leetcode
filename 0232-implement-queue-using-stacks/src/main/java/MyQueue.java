import java.util.Stack;

class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    // Push element x to the back of queue.
    public void push(int x) {
        in.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!out.empty()) {
            out.pop();
        } else if (!in.empty()) {
            transfer(in, out);
            out.pop();
        }
    }

    // Get the front element.
    public int peek() {
        int peek;
        if (!out.empty()) {
            peek = out.peek();
        } else if (!in.empty()) {
            transfer(in, out);
            peek = out.peek();
        } else {
            peek = 0;
        }
        return peek;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return in.empty() && out.empty();
    }

    private void transfer(Stack<Integer> in, Stack<Integer> out) {
        int n = in.size();
        for (int i=0; i < n; i++) {
            out.push(in.pop());
        }
    }
}
