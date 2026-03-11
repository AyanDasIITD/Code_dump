import java.util.*;

public class min_stack {
    Deque<Integer> dq = new ArrayDeque<>();
    Deque<Integer> dq_min = new ArrayDeque<>();

    public void push(int x) {
        if (dq_min.isEmpty())
            dq_min.push(x);
        else if (dq_min.peek() > x)
            dq_min.push(x);
        else
            dq_min.push(dq_min.peek());
        dq.push(x);

    }

    public void pop() {
        if (dq.isEmpty())
            return;
        else
            dq_min.pop();
        dq.pop();

    }

    public int top() {
        if (dq.isEmpty())
            return -1;
        else

            return dq.peek();

    }

    public int getMin() {
        if (dq.isEmpty())
            return -1;
        else
            return dq_min.peek();

    }

    public static void main(String[] args) {
        min_stack ms = new min_stack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);
        ms.push(-1);
        ms.push(-2);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }

}
