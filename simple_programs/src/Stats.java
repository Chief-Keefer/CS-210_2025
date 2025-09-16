import stdlib.StdOut;
import stdlib.StdRandom;

public class Stats {
    // Entry Point.
    public static void main(String[] args) {
        // TODO
        // Initializes a and b as ints
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]) + 1;

        // Initializes x1, x2, x3, mean, var, and std as doubles and calculates values
        // of variables that need it
        double x1 = StdRandom.uniform(a, b);
        double x2 = StdRandom.uniform(a, b);
        double x3 = StdRandom.uniform(a, b);

        double mean = (x1 + x2 + x3) / 3.0;
        double var = (((x1 - mean) * (x1 - mean)) + ((x2 - mean) * (x2 - mean)) + ((x3 - mean) * (x3 - mean))) / 3.0;
        double std = Math.sqrt(var);

        // Prints mean, var, and std to standard output
        StdOut.print(mean + " ");
        StdOut.print(var + " ");
        StdOut.println(std);
    }
}
