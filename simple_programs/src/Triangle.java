import stdlib.StdOut;

public class Triangle {
    // Entry Point.
    public static void main(String[] args) {
        // TODO
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if (x + y > z && x + z > y && y + z > x) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }
}
