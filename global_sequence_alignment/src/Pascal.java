import stdlib.StdOut;

public class Pascal {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        // read an integer n from command line argument and creates a jagged array
        int n = Integer.parseInt(args[0]) + 1;
        int[][] pascal = new int[n][];

        // initializes the array to represent the first n rows of Pascal's triangle
        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        // print the array to standard output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j < i) {
                    StdOut.print(pascal[i][j] + " ");
                } else {
                    StdOut.println(pascal[i][j]);
                }
            }
        }
    }
}
