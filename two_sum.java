import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class two_sum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int B = 9;
        System.out.println(twoSum(A, B));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (hash.containsKey(B - A.get(i)))
                return new ArrayList<>(Arrays.asList(hash.get(B - A.get(i)) + 1, i + 1));
            else if (!(hash.containsKey(A.get(i))))
                hash.put(A.get(i), i);
        }
        return new ArrayList<>();
    }
}
