import java.util.*;
// import java.io.*;

public class Pick_me_both {
    public static void main(String[] args) {
        Pick_me_both mySolver = new Pick_me_both();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        int B = 3;
        System.out.println(mySolver.solve(A, B));
    }

    public int solve(ArrayList<Integer> A, int B) {
        int max_sum = 0, i = 0;
        for (i = 0; i < B; i++) {
            max_sum += A.get(i);
        }
        for (i = 0; i <= B; i++) {
            int left = 0, right = 0;
            for (int k = 0; k < i; k++) {
                left += A.get(k);
            }
            int j = B - i;
            for (int l = 0; l < j; l++) {
                right += A.get(A.size() - 1 - l);
            }
            if (max_sum < left + right) {
                max_sum = left + right;
            }
        }
        return max_sum;
    }

}
