import java.util.Arrays;
import stdlib.StdOut;

public class Matrix {
    // Returns true if the square matrix a represents a magic square, and false
    // otherwise.
    public static boolean isMagicSquare(int[][] a) {
        // TODO
        
    }

    // Entry point [DO NOT EDIT].
    public static void main(String[] args) {
        int[][] a = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
        int[][] b = { { 2, 3, 1 }, { 4, 5, 7 }, { 9, 6, 8 } };
        StdOut.println("a = " + Arrays.deepToString(a) + "; " +
                isMagicSquare(a));
        StdOut.println("b = " + Arrays.deepToString(b) + "; " +
                isMagicSquare(b));
    }
}
