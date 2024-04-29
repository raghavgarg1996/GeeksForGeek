import java.util.HashSet;

public class Missing_Number_In_Array {

    public static int missingNumber(int array[], int n) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hs.add(array[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2};
        int N = 1;
        System.out.println(missingNumber(arr, N));
    }
}
