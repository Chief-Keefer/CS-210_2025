import stdlib.StdOut;

public class GCD {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        
        while (p % q != 0){
            int temp = p % q;
            p = q;
            q = temp;
        }

        
        StdOut.println(q);
    }
}
