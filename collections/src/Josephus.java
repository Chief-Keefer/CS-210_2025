import dsa.LinkedQueue;
import stdlib.StdOut;

public class Josephus {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        LinkedQueue<Integer> q = new LinkedQueue<Integer>();

        for (int i = 1; i <= n; i++) {
            q.enqueue(i);
        }

        int i = 0;
        while (!q.isEmpty()) {
            i++;
            int pos = q.dequeue();
            if (i % m != 0) {
                q.enqueue(pos);
            } else {
                StdOut.println(pos);
            }
        }
    }
}
