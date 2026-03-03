import java.util.*;

public class water_tank {
    public static void main(String[] args) {
        int[] A = { 4, 2, 0, 3, 2, 5 };
        System.out.println(calc_water(A));
    }

    public static int calc_water(int[] A) {
        int[] max_left = new int[A.length], max_right = new int[A.length];
        int max_l = 0, max_r = 0;
        for (int i = 0; i < A.length; i++) {
            max_left[i] = Math.max(max_l, A[i]);
            max_l = max_left[i];
            max_right[A.length - 1 - i] = Math.max(max_r, A[A.length - 1 - i]);
            max_r = max_right[A.length - 1 - i];
        }
        // System.out.println(Arrays.toString(max_left));
        // System.out.println(Arrays.toString(max_right));
        int water = 0;
        for (int i = 0; i < A.length; i++) {
            water += Math.min(max_right[i], max_left[i]) - A[i];
        }
        return water;
    }
}