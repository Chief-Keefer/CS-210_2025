import stdlib.StdIn;
import stdlib.StdOut;

public class Distance {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        // read an integer n from command line argument
        int n = Integer.parseInt(args[0]);

        // read two arrays of n double values from standard input
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = StdIn.readDouble();
        }

        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            y[i] = StdIn.readDouble();
        }

        // compute Euclidean distance
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += (x[i] - y[i]) * (x[i] - y[i]);
        }

        StdOut.println(Math.sqrt(sum));

    }
}
