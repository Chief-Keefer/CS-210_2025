import stdlib.StdOut;

public class Fibonacci {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int n = Integer.parseInt(args[0]);
        if (n == 0) {
            StdOut.println(0);
            return;
        } else if (n == 1) {
            StdOut.println(1);
            return;
        }

        long a = 0;
        long b = 1;
        long c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        StdOut.println(c);
    }

}
