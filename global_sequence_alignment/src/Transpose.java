import stdlib.StdIn;
import stdlib.StdOut;

public class Transpose {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        // read 2 ints m and n from standard input
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        // read an m-by-n matrix of double values from standard input
        double[][] matrix = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = StdIn.readDouble();
            }
        }

        // compute the transpose of the matrix
        double[][] transpose = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // print the transpose to standard output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j < m - 1) {
                    StdOut.printf("%6f ", transpose[i][j]);
                } else {
                    StdOut.printf("%6f\n", transpose[i][j]);
                }
            }

        }
    }
}
