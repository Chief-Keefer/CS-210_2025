import stdlib.StdOut;
import stdlib.StdRandom;

public class Card {
    // Entry point.
    public static void main(String[] args) {
        // TODO
        int suit = StdRandom.uniform(1, 5);
        int rank = StdRandom.uniform(1, 14);

        String suitString = "";
        String rankString = "";

        if (suit == 1) {
            suitString = "Clubs";
        } else if (suit == 2) {
            suitString = "Diamonds";
        } else if (suit == 3) {
            suitString = "Hearts";
        } else {
            suitString = "Spades";
        }

        if (rank == 1) {
            rankString = "Ace";
        } else if (rank == 11) {
            rankString = "Jack";
        } else if (rank == 12) {
            rankString = "Queen";
        } else if (rank == 13) {
            rankString = "King";
        } else {
            rankString = Integer.toString(rank);
        }

        StdOut.println(rankString + " of " + suitString);
    }
}
