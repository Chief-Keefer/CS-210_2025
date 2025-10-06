import stdlib.StdArrayIO;
import stdlib.StdIn;
import stdlib.StdOut;

public class Alignment {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        // read two strings from standard input store their lengths in m and n
        String x = StdIn.readString();
        String y = StdIn.readString();
        int m = GSA.length(x);
        int n = GSA.length(y);

        // read the optimal array from standard input
        int[][] opt = StdArrayIO.readInt2D();

        // print the edit distance
        StdOut.printf("%d\n", opt[0][0]);

        // print the alignment
        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            // If x or y is exhausted, we can only insert gaps in the other string.
            if (i >= m) {
                StdOut.printf("- %c 2\n", GSA.charAt(y, j));
                j++;
                continue;
            } else if (j >= n) {
                StdOut.printf("%c - 2\n", GSA.charAt(x, i));
                i++;
                continue;
            }

            // We have three choices: insert a gap in x, insert a gap in y, or
            // match/mismatch.
            if (opt[i][j] == opt[i + 1][j] + 2) {
                StdOut.printf("%c - 2\n", GSA.charAt(x, i));
                i++;
            } else if (opt[i][j] == opt[i][j + 1] + 2) {
                StdOut.printf("- %c 2\n", GSA.charAt(y, j));
                j++;
            } else {
                if (GSA.charAt(x, i) == GSA.charAt(y, j)) {
                    StdOut.printf("%c %c 0\n", GSA.charAt(x, i), GSA.charAt(y, j));
                } else {
                    StdOut.printf("%c %c 1\n", GSA.charAt(x, i), GSA.charAt(y, j));
                }
                i++;
                j++;
            }

        }

    }
}
