import java.util.HashMap;
import java.util.Map;

public class Find_Missing_and_Repeating {

    public static int[] findTwoElement(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] sol = new int[2];
        int mostRepeatKey = 0;
        int mostRepeatValue = 0;
        int missing = 0;


        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                int k = hm.get(arr[i]);
                hm.put(arr[i], ++k);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            int k = (int) entry.getValue();
            if (mostRepeatValue < k) {
                mostRepeatValue = k;
                mostRepeatKey = (int) entry.getKey();
            }
        }

        sol[0] = mostRepeatKey;

        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(i + 1)) {
                missing = i + 1;
            }
        }

        sol[1] = missing;

        return sol;
    }

    public static void main(String[] args) {
        int arr[] = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        int n = 47;
        int[] sol = new int[2];
        sol = findTwoElement(arr, n);
        System.out.println(sol[0] + " " + sol[1]);
    }
}
