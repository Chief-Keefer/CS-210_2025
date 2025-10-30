import java.util.Comparator;
import java.util.Iterator;

import stdlib.StdOut;

// A comparable, iterable class representing a word.
public class Word implements Comparable<Word>, Iterable<Character> {
    // TODO
    private String value;

    // Constructs a Word object from the given string.
    public Word(String word) {
        // TODO
        this.value = word;

    }

    // Returns the number characters in this word.
    public int length() {
        // TODO
        return value.length();
    }

    // Returns this word in lower case.
    public Word toLower() {
        // TODO
        Word newWord = new Word(value.toLowerCase());
        return newWord;
    }

    // Returns true if this word is the same as other, and false otherwise.
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (other.getClass() != getClass()) {
            return false;
        }
        // TODO
        Word that = (Word) other;
        return this.compareTo(that) == 0;
    }

    // Returns a string representation of this word.
    public String toString() {
        // TODO
        return value;
    }

    // Returns an alphabetical comparison of this word and other.
    public int compareTo(Word other) {
        // TODO
        return this.value.compareTo(other.value);

    }

    // Returns a comparator for comparing words based on their lengths.
    public static Comparator<Word> lengthOrder() {
        return new LengthOrder();
    }

    // Returns an iterator for iterating over the characters in this word.
    public Iterator<Character> iterator() {
        return new WordIterator();
    }

    // A comparator for comparing words based on their lengths.
    private static class LengthOrder implements Comparator<Word> {
        // Returns a comparison of words w1 and w2 based on their lengths.
        public int compare(Word w1, Word w2) {
            // TODO
            return Integer.compare(w1.length(), w2.length());

        }
    }

    // An iterator for iterating over the characters in a word.
    private class WordIterator implements Iterator<Character> {
        // TODO
        int i;

        // Constructs a WordIterator object.
        public WordIterator() {
            // TODO
            this.i = 0;
        }

        // Returns true if there are more characters in the word, and false
        // otherwise.
        public boolean hasNext() {
            // TODO
            return ++i < value.length();
        }

        // Returns the next character in the word.
        public Character next() {
            // TODO
            return value.charAt(i++);
        }
    }

    // Unit tests the data type [DO NOT EDIT].
    public static void main(String[] args) {
        Word w1 = new Word("ABRACADABRA");
        Word w2 = new Word("alacazam");
        StdOut.println("w1               = " + w1);
        StdOut.println("w2               = " + w2);
        StdOut.println("w1.length()      = " + w1.length());
        StdOut.println("w1.toLower()     = " + w1.toLower());
        StdOut.println("w1.equals(w2)    = " + w1.equals(w2));
        StdOut.println("w1.compareTo(w2) = " + w1.compareTo(w2));
        StdOut.println("compare(w1, w2)  = " +
                Word.lengthOrder().compare(w1, w2));
        StdOut.print("chars in w1      = ");
        for (char c : w1) {
            StdOut.print(c + " ");
        }
        StdOut.println();
    }
}
