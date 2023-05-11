import java.util.Arrays;

public class Find_Missing_and_Repeating_Optimized {

    public static int[] findTwoElement(int arr[], int n) {
        int[] sol = new int[2];

        // Finding the repeating element
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            } else {
                sol[0] = Math.abs(arr[i]);
            }
        }

        // Finding the missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sol[1] = i + 1;
                break;
            }
        }

        return sol;
    }

    public static void main(String[] args) {
        int arr[] = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        int n = 47;
        int[] sol = findTwoElement(arr, n);
        System.out.println(Arrays.toString(sol));
    }
}