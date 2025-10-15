import stdlib.StdOut;

public class Harmonic {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int n = Integer.parseInt(args[0]);
        Rational sum = new Rational(0, 1);

        for (int i = 1; i <= n; i++) {
            Rational r = new Rational(1, i);
            sum = sum.add(r);
        }

        StdOut.println(sum);
    }
}
