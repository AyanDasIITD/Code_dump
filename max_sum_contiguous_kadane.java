import java.util.*;
// import java.util.List;

public class max_sum_contiguous_kadane {
    public static void main(String[] args) {
        max_sum_contiguous_kadane mySolver = new max_sum_contiguous_kadane();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(-163);
        A.add(-20);
        // A.add(3);
        // A.add(4);
        // A.add(5);
        // // int B = 3;
        System.out.println(mySolver.maxSubArray(A));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int cur_sum = A.get(0), max_sum = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (cur_sum + A.get(i) < A.get(i)) {
                cur_sum = A.get(i);
                // System.out.println("cur_sum: " + cur_sum);
            } else {
                cur_sum += A.get(i);
            }
            max_sum = Math.max(cur_sum, max_sum);
        }
        return max_sum;

    }
}
