import stdlib.StdOut;
import stdlib.StdRandom;

public class Die {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int face = StdRandom.uniform(1, 7);
        if (face == 1) {
            StdOut.println("     \n  *  \n     ");
        } else if (face == 2) {
            StdOut.println("*    \n     \n    *");
        } else if (face == 3) {
            StdOut.println("*    \n  *  \n    *");
        } else if (face == 4) {
            StdOut.println("*   *\n     \n*   *");
        } else if (face == 5) {
            StdOut.println("*   *\n  *  \n*   *");
        } else {
            StdOut.println("*   *\n*   *\n*   *");
        }
    }
}
