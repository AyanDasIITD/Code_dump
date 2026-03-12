import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class first_non_repeating_element {
    public static void main(String[] args) {
        first_non_repeating_element f = new first_non_repeating_element();
        String A = "aabc";
        System.out.println(f.solve(A));
    }

    public String solve(String A) {
        Queue<Character> chq = new LinkedList<>();
        HashMap<Character, Integer> chh = new HashMap<>();
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if (chh.containsKey(A.charAt(i)))
                chh.put(A.charAt(i), chh.get(A.charAt(i)) + 1);
            else {
                chh.put(A.charAt(i), 1);
                chq.add(A.charAt(i));
            }
            while ((!chq.isEmpty()) && chh.get(chq.peek()) > 1)
                chq.poll();
            if (chq.isEmpty())
                f.append('#');
            else
                f.append(chq.peek());

        }
        return f.toString();

    }
}