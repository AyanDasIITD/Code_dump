import java.util.*;

public class check_palindrome {
    public static void main(String[] args) {
        check_palindrome mySolver = new check_palindrome();
        String A = "abba";
        System.out.println(mySolver.solve(A));
    }

    public int solve(String A) {
        HashMap<Character, Integer> ch_freq = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if (ch_freq.containsKey(A.charAt(i)))
                ch_freq.put(A.charAt(i), ch_freq.get(A.charAt(i)) + 1);
            else
                ch_freq.put(A.charAt(i), 1);
        }
        if (A.length() % 2 == 0) {
            for (Map.Entry<Character, Integer> entry : ch_freq.entrySet()) {
                if ((entry.getValue() % 2) == 1)
                    return 0;
            }
            return 1;
        } else {
            int count = 0;
            for (Map.Entry<Character, Integer> entry : ch_freq.entrySet()) {
                if ((entry.getValue() % 2) == 1)
                    count++;
            }
            if (count != 1)
                return 0;
            else
                return 1;
        }
    }
}
