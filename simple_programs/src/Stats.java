import stdlib.StdOut;
import stdlib.StdRandom;

public class Stats {
    // Entry Point.
    public static void main(String[] args) {
        // TODO
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        double x1 = StdRandom.uniform(a, b + 1);
        double x2 = StdRandom.uniform(a, b + 1);
        double x3 = StdRandom.uniform(a, b + 1);

        double mean = (x1 + x2 + x3) / 3.0;
        double variance = (((x1 - mean) * (x1 - mean)) + ((x2 - mean) * (x2 - mean)) + ((x3 - mean) * (x3 - mean))) / 3.0;
        double stddev = Math.sqrt(variance);
        StdOut.println(mean + " " + stddev + " " + variance);
    }
}
