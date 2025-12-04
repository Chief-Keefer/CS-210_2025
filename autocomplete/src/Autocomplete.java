import dsa.Merge;

import java.util.Comparator;

import stdlib.In;
import stdlib.StdIn;
import stdlib.StdOut;

public class Autocomplete {
    private Term[] terms;

    // Constructs an Autocomplete data structure from an array of terms.
    public Autocomplete(Term[] terms) {
        if (terms == null) {
            throw new NullPointerException("terms is null");
        }
        // Defensive copy of terms array and sort it
        this.terms = new Term[terms.length];
        System.arraycopy(terms, 0, this.terms, 0, terms.length);
        Merge.sort(this.terms);
    }

    // Returns all terms that start with prefix, in descending order of their
    // weights.
    public Term[] allMatches(String prefix) {
        if (prefix == null) {
            throw new NullPointerException("prefix is null");
        }

        // Find the number of matches using the BinarySearchDeluxe methods
        Term prefixTerm = new Term(prefix);
        Comparator<Term> prefixOrder = Term.prefixOrder(prefix.length());
        int firstIndex = BinarySearchDeluxe.firstIndexOf(terms, prefixTerm, prefixOrder);
        if (firstIndex == -1) {
            return new Term[0];
        }
        int lastIndex = BinarySearchDeluxe.lastIndexOf(terms, prefixTerm, prefixOrder);
        int numMatches = lastIndex - firstIndex + 1;

        // Collect all matching terms
        Term[] matches = new Term[numMatches];
        for (int i = 0; i < numMatches; i++) {
            matches[i] = terms[firstIndex + i];
        }

        // Sort matches in descending order by weight
        Merge.sort(matches, Term.reverseWeightOrder());
        return matches;
    }

    // Returns the number of terms that start with prefix.
    public int numberOfMatches(String prefix) {
        if (prefix == null) {
            throw new NullPointerException("prefix is null");
        }
        Term prefixTerm = new Term(prefix);
        int firstIndex = BinarySearchDeluxe.firstIndexOf(terms, prefixTerm, Term.prefixOrder(prefix.length()));
        int lastIndex = BinarySearchDeluxe.lastIndexOf(terms, prefixTerm, Term.prefixOrder(prefix.length()));
        if (firstIndex == -1 || lastIndex == -1) {
            return 0;
        }
        return lastIndex - firstIndex + 1;
    }

    // Unit tests the data type. [DO NOT EDIT]
    public static void main(String[] args) {
        String filename = args[0];
        int k = Integer.parseInt(args[1]);
        In in = new In(filename);
        int n = in.readInt();
        Term[] terms = new Term[n];
        for (int i = 0; i < n; i++) {
            long weight = in.readLong();
            in.readChar();
            String query = in.readLine();
            terms[i] = new Term(query.trim(), weight);
        }
        Autocomplete autocomplete = new Autocomplete(terms);
        StdOut.print("Enter a prefix (or ctrl-d to quit): ");
        while (StdIn.hasNextLine()) {
            String prefix = StdIn.readLine();
            Term[] results = autocomplete.allMatches(prefix);
            String msg = " matches for \"" + prefix + "\", in descending order by weight:";
            if (results.length == 0) {
                msg = "No matches";
            } else if (results.length > k) {
                msg = "First " + k + msg;
            } else {
                msg = "All" + msg;
            }
            StdOut.printf("%s\n", msg);
            for (int i = 0; i < Math.min(k, results.length); i++) {
                StdOut.println("  " + results[i]);
            }
            StdOut.print("Enter a prefix (or ctrl-d to quit): ");
        }
    }
}
