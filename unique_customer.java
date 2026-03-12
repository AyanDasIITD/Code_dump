import java.util.*;

public class unique_customer {
    public int uniqueCustomer(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i]))
                h.put(arr[i], h.get(arr[i]) + 1);
            else
                h.put(arr[i], 1);
        }
        // int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (h.get(arr[i]) == 1)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        unique_customer uc = new unique_customer();
        int[] arr = { 1, 2, 3, 2, 1 };
        System.out.println(uc.uniqueCustomer(arr));
    }

}
