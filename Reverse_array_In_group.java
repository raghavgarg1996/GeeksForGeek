import java.util.*;

public class Reverse_array_In_group {

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int[] ar = new int[k];
        int[] arra = new int[n];

        if (k<n) {
            int[] sec = new int[n-k];

            for (int i=0; i<k; i++) {
                ar[k-i-1]=arr.get(i);
            }

            for (int i=0; i<n-k; i++) {
                sec[n-k-i-1] = arr.get(k+i);
            }

            for (int i=0; i<k ; i++) {
                arr.remove(i);
                arr.add(i,ar[i]);
            }

            for (int i=0; i<n-k; i++) {
                arr.remove(k+i);
                arr.add(i+k,sec[i]);
            }

        } else {
            for (int i=0; i<n; i++) {
                arra[n-i-1] = arr.get(i);
            }

            arr.clear();
            for (int i=0; i<n; i++) {
                arr.add(i,arra[i]);
            }
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        int N = 5;
        int K = 77;

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        reverseInGroups(ls, N, K);
    }
}
