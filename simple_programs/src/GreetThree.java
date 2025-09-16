import stdlib.StdOut;

public class GreetThree {
    // Entry Point.
    public static void main(String[] args) {
        // TODO
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        StdOut.print("Hi ");
        StdOut.print(name3);
        StdOut.print(", ");
        StdOut.print(name2);
        StdOut.print(", and ");
        StdOut.println(name1 + ".");

    }
}
