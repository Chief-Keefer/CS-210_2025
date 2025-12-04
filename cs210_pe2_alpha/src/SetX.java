import dsa.Set;
import java.util.Iterator;
import stdlib.StdOut;

// An iterable data type to represent an ordered set.
public class SetX<Key extends Comparable<Key>> implements Iterable<Key> {
    private Set<Key> set; // the underlying set.

    // Constructs an empty set.
    public SetX() {
        // TODO
    }

    // Constructs a set from the given keys.
    public SetX(Key[] keys) {
        // TODO
    }

    // Returns true if this set is empty, and false otherwise.
    public boolean isEmpty() {
        // TODO
        return false;
    }

    // Returns the number of keys in this set.
    public int size() {
        // TODO
        return 0;
    }

    // Adds key to this set, if it is not already present.
    public void add(Key key) {
        // TODO
    }

    // Returns true if this set contains key, and false otherwise.
    public boolean contains(Key key) {
        // TODO
        return false;
    }

    // Returns an iterator to iterate over the keys in this set in sorted order.
    public Iterator<Key> iterator() {
        return set.iterator();
    }

    // Returns a string representation of this set.
    public String toString() {
        return set.toString();
    }
    
    // Returns the union of this set and other, ie, the keys that are in this set or other or both.
    public SetX<Key> union(SetX<Key> other) {
        // TODO
        return null;
    }
        
    // Returns the intersection of this set and other, ie, the keys that are in this set and other.
    public SetX<Key> intersection(SetX<Key> other) {
        // TODO
        return null;
    }

    // Returns the difference of this set and other, ie, the keys that are in this set but not other.
    public SetX<Key> difference(SetX<Key> other) {
        // TODO
        return null;
    }
        
    // Returns the symmetric difference of this set and other, ie, the keys that are in this set or other but not both.
    public SetX<Key> symmetricDifference(SetX<Key> other) {
        // TODO
        return null;
    }

    // Returns true if this set and other are the same (ie, contain the same keys), and false otherwise.
    @SuppressWarnings("unchecked")
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        // TODO
        return false;
    }
    
    // Unit tests the data type [DO NOT EDIT].
    public static void main(String[] args) {
        SetX<Character> a = new SetX<Character>(new Character[]{'e', 'i', 'n', 's', 't', 'e', 'i', 'n'});
        SetX<Character> b = new SetX<Character>(new Character[]{'d', 'a', 'r', 'w', 'i', 'n'});
        SetX<Character> c = new SetX<Character>(new Character[]{'s', 't', 'e', 'i', 'n'});
        StdOut.println("a                        = " + a);
        StdOut.println("b                        = " + b);
        StdOut.println("c                        = " + c);
        StdOut.println("a.union(b)               = " + a.union(b));
        StdOut.println("a.intersection(b)        = " + a.intersection(b));
        StdOut.println("a.difference(b)          = " + a.difference(b));
        StdOut.println("b.difference(a)          = " + b.difference(a));
        StdOut.println("a.symmetricDifference(b) = " + a.symmetricDifference(b));
        StdOut.println("a.equals(b)              = " + a.equals(b));
        StdOut.println("a.equals(c)              = " + a.equals(c));
    }
}