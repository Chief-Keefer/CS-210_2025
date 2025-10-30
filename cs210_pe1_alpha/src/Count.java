import stdlib.StdOut;

public class Count {
    public static void main(String[] args) {
        // TODO
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        StdOut.println(sum);
    }
}
