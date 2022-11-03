public class Print_1_n_without_loops {
    public static void printTillN(int N) {

        if (N == 1) {
            System.out.print(N + " ");
            return;
        }

        printTillN(N - 1);
        System.out.print(N + " ");

    }

    public static void main(String[] args) {
        int N = 5;
        printTillN(N);
    }
}
