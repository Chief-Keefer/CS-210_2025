import stdlib.StdOut;

public class RamanujanNumbers {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int n = Integer.parseInt(args[0]);
        int a = 1;

        while (a * a * a <= n) {
            int b = a + 1;
            while (b * b * b <= n) {
                int c = a + 1;
                while (c * c * c <= n) {
                    int d = c + 1;
                    while (d * d * d <= n) {
                        if (a * a * a + b * b * b == c * c * c + d * d * d && a * a * a + b * b * b <= n) {
                            StdOut.println(
                                    (a * a * a + b * b * b) + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d
                                            + "^3");
                        }
                        d++;
                    }
                    c++;
                }
                b++;
            }
            a++;
        }
    }
}
