import java.util.Stack;

class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long value = (long) val;
        if (st.isEmpty()) {
            st.push(value);
            min = value;
        } else if (value >= min) {
            st.push(value);
        } else {
            st.push(2 * value - min);
            min = value;
        }
    }

    public void pop() {
        if (st.isEmpty()) {
            return;
        }
        long top = st.pop();
        if (top < min) {
            min = 2 * min - top;
        }
    }

    public int top() {
        if (st.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        long top = st.peek();
        return (int) (top < min ? min : top);
    }

    public int getMin() {
        if (st.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (int) min;
    }
}
