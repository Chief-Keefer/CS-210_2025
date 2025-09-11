import stdlib.StdOut;

public class Factorial {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int n = Integer.parseInt(args[0]);
        long result = 1;
        
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        StdOut.println(result);
    }
}
