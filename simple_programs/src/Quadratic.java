import stdlib.StdOut;

public class Quadratic {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        double a = Double.parseDouble(args[0]);
        if (a == 0) {
            StdOut.println("Value of a must not be 0");
            return;
        }
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            StdOut.println("Value of discriminant must not be negative");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            StdOut.println(root1 + " " + root2);
        }
    }
}
