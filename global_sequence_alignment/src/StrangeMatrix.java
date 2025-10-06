import stdlib.StdOut;

public class StrangeMatrix {
    public static void main(String[] args) {
        // TODO
        // read 2 ints m and n from command line arguments
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        // create an m-by-n matrix of int values
        int[][] matrix = new int[m][n];

        // Initializes the last column to m-1, m-2, ..., 0
        for (int i = 0; i < m; i++) {
            matrix[i][n - 1] = m - i - 1;
        }

        // fills in the last row with n-1, n-2, ..., 0
        for (int j = 0; j < n; j++) {
            matrix[m - 1][j] = n - j - 1;
        }

        // assigns each remaining element to the sum of the element to the right,
        // the element below, and the element diagonally below and to the right
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                matrix[i][j] = matrix[i][j + 1] + matrix[i + 1][j + 1] + matrix[i + 1][j];
            }
        }

        // print the matrix to standard output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1) {
                    StdOut.printf("%5d ", matrix[i][j]);
                } else {
                    StdOut.printf("%5d\n", matrix[i][j]);
                }
            }
        }
    }
}
