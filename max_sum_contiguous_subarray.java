import java.util.*;

public class max_sum_contiguous_subarray {
    public static void main(String[] args) {
        max_sum_contiguous_subarray mySolver = new max_sum_contiguous_subarray();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        // int B = 3;
        System.out.println(mySolver.maxSubArray(A));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int global_sum = A.get(0);
        for (int s_len = 1; s_len <= A.size(); s_len++) {
            int i = 0, cur_sum = 0, max_sum = 0;
            for (i = 0; i < s_len; i++) {
                cur_sum += A.get(i);
            }
            max_sum = cur_sum;
            i = 1;
            int j = i + s_len - 1;
            for (i = 1, j = i + s_len - 1; j < A.size(); i++, j++) {

                cur_sum += A.get(j) - A.get(i - 1);
                max_sum = Math.max(max_sum, cur_sum);
            }
            global_sum = Math.max(global_sum, max_sum);
        }
        return global_sum;
    }
}
