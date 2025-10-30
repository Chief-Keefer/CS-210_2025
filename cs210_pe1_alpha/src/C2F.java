import stdlib.StdOut;

public class C2F {
    public static void main(String[] args) {
        // TODO
        double c = Double.parseDouble(args[0]);
        double f = ((9.0 / 5.0) * c) + 32.0;

        StdOut.printf("%.1fC = %.1fF\n", c, f);

    }
}
