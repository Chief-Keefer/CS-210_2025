import stdlib.StdOut;

public class PerfectNumbers {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int n = Integer.parseInt(args[0]);
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                StdOut.println(i);
            }
        }
    }
}
