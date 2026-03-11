import java.util.*;

public class balanced_parenthesis {
    public int solve(String A) {
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '(')
                dq.push(ch);
            else {
                if (!(dq.isEmpty())) {
                    if (dq.pop() == '(')
                        continue;
                    else
                        return 0;
                } else
                    return 0;

            }

        }
        if (!(dq.isEmpty()))
            return 0;
        return 1;

    }

    public static void main(String[] args) {
        balanced_parenthesis bp = new balanced_parenthesis();
        System.out.println(bp.solve("(()()))"));
    }

}
