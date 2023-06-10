import java.util.*;

public class Arranging_The_Array {

    public static void Rearrange(int a[], int n)
    {
        // Your code goes here
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();
        int[] finalArray = new int[n];

        for (int i=0; i<n; i++) {
            if (a[i]<0) {
                negList.add(a[i]);
            } else {
                posList.add(a[i]);
            }
        }

        for (int i=0; i<negList.size(); i++) {
            finalArray[i]= negList.get(i);
        }

        for (int i=0; i<posList.size(); i++) {
            finalArray[negList.size()+i] = posList.get(i);
        }


        for (int i=0; i<n; i++) {
            a[i]=finalArray[i];
        }
    }

    public static void main (String[] args) {

        int n =7;
        int[] arr = {-3, 3, -2, 2};

        Rearrange(arr, n);
    }
}
