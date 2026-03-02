import java.util.*;

public class pick_me_both_optimum {
    public static void main(String[] args) {
        pick_me_both_optimum mySolver = new pick_me_both_optimum();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        int B = 3;
        System.out.println(mySolver.solve_optimum(A, B));
    }

    public int solve_optimum(ArrayList<Integer> A, int B) {
        int i = 0, current_sum = 0, max_sum = 0;
        for (i = 0; i < B; i++) {
            current_sum += A.get(i);
        }
        max_sum = current_sum;
        for (int j = 1; j < B; j++) {
            i = B - j;
            current_sum += A.get(A.size() - j) - A.get(B - j);
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }

}
