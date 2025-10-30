import dsa.WeightedQuickUnionPathCompressionUF;
import stdlib.In;
import stdlib.StdOut;

public class Percolation {
    private int n; // size of the percolation system
    private boolean[][] grid; // representation of the system (true = open site, false = blocked site)
    private int openSites; // number of sites opened
    private WeightedQuickUnionPathCompressionUF uf1; // for testing percolation
    private WeightedQuickUnionPathCompressionUF uf2; // for preventing backwash
    private int source; // source site (id = 0)
    private int sink; // sink site (id = n * n + 1)

    // Constructs an n x n percolation system, with all sites blocked.
    public Percolation(int n) {
        // TODO
        if (n <= 0)
            throw new IllegalArgumentException("Illegal n");
        this.n = n;
        grid = new boolean[n][n];
        openSites = 0;
        uf1 = new WeightedQuickUnionPathCompressionUF(n * n + 2); // source and sink
        uf2 = new WeightedQuickUnionPathCompressionUF(n * n + 1); // source
        source = 0;
        sink = n * n + 1;
    }

    // Opens site (i, j) if it is not already open.
    public void open(int i, int j) {
        // TODO
        if (i < 0 || i >= n || j < 0 || j >= n)
            throw new IndexOutOfBoundsException("Illegal i or j");
        if (!grid[i][j]) {
            grid[i][j] = true;
            openSites++;
            int currentSite = encode(i, j);

            // If the site is in the first or last row, connect it to the source or sink
            if (i == 0) {
                uf1.union(source, currentSite);
                uf2.union(source, currentSite);

            } else if (i == n - 1) {
                uf1.union(sink, currentSite);
            }

            // handles the case when n = 1
            if (n == 1) {
                uf1.union(sink, currentSite);
            }

            // Connect to adjacent open sites
            if (i + 1 < n) {
                if (isOpen(i + 1, j)) { // down
                    uf1.union(currentSite, encode(i + 1, j));
                    uf2.union(currentSite, encode(i + 1, j));
                }
            }
            if (i - 1 >= 0) {
                if (isOpen(i - 1, j)) { // up
                    uf1.union(currentSite, encode(i - 1, j));
                    uf2.union(currentSite, encode(i - 1, j));
                }
            }
            if (j + 1 < n) {
                if (isOpen(i, j + 1)) { // right
                    uf1.union(currentSite, encode(i, j + 1));
                    uf2.union(currentSite, encode(i, j + 1));
                }
            }
            if (j - 1 >= 0) {
                if (isOpen(i, j - 1)) { // left
                    uf1.union(currentSite, encode(i, j - 1));
                    uf2.union(currentSite, encode(i, j - 1));
                }
            }

        }
    }

    // Returns true if site (i, j) is open, and false otherwise.
    public boolean isOpen(int i, int j) {
        // TODO
        if (i < 0 || i >= n || j < 0 || j >= n)
            throw new IndexOutOfBoundsException("Illegal i or j");
        return grid[i][j];
    }

    // Returns true if site (i, j) is full, and false otherwise.
    public boolean isFull(int i, int j) {
        // TODO
        if (i < 0 || i >= n || j < 0 || j >= n)
            throw new IndexOutOfBoundsException("Illegal i or j");
        return uf2.connected(source, encode(i, j));
    }

    // Returns the number of open sites.
    public int numberOfOpenSites() {
        // TODO
        return openSites;
    }

    // Returns true if this system percolates, and false otherwise.
    public boolean percolates() {
        // TODO
        return uf1.connected(source, sink);
    }

    // Returns an integer ID (1...n) for site (i, j).
    private int encode(int i, int j) {
        // TODO
        return i * n + j + 1;
    }

    // Unit tests the data type. [DO NOT EDIT]
    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        int n = in.readInt();
        Percolation perc = new Percolation(n);
        while (!in.isEmpty()) {
            int i = in.readInt();
            int j = in.readInt();
            perc.open(i, j);
        }
        StdOut.printf("%d x %d system:\n", n, n);
        StdOut.printf("  Open sites = %d\n", perc.numberOfOpenSites());
        StdOut.printf("  Percolates = %b\n", perc.percolates());
        if (args.length == 3) {
            int i = Integer.parseInt(args[1]);
            int j = Integer.parseInt(args[2]);
            StdOut.printf("  isFull(%d, %d) = %b\n", i, j, perc.isFull(i, j));
        }
    }
}
