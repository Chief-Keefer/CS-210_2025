import stdlib.StdIn;
import stdlib.StdOut;

public class Reverse {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        // read all strings given from standard input
        String[] s = StdIn.readAllStrings();

        // reverse the order of the strings using a loop and a temp variable
        for (int i = 0; i < s.length / 2; i++) {
            String temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;

        }

        // print the strings in reverse order to standard output
        for (int i = 0; i < s.length; i++) {
            if (i < s.length - 1) {
                StdOut.print(s[i] + " ");
            } else {
                StdOut.println(s[i]);
            }
        }

    }
}
