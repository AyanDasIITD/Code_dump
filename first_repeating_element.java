import java.util.*;

public class first_repeating_element {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 5, 3, 4, 3, 5, 6));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.size(); i++) {
            if (hash.containsKey(A.get(i)))
                hash.put(A.get(i), hash.get(A.get(i)) + 1);
            else
                hash.put(A.get(i), 1);
        }

        for (int i = 0; i < A.size(); i++) {
            if (hash.get(A.get(i)) > 1) {
                return A.get(i);
            }
        }

        return -1;
    }
}