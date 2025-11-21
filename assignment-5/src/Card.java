package src;

/**
 * This program defines a Card class representing a playing card with its rank and suit.
 * A card can also be in an empty, undefined state.
 *
 */
public class Card
{
    // field declarations

    /** Unicode character for the spade suit */
    public static final Character SPADES = '♠';

    /** Unicode character for the diamond suit */
    public static final Character DIAMONDS = '♦';

    /** Unicode character for the heart suit */
    public static final Character HEARTS = '❤';

    /** Unicode character for the club suit */
    public static final Character CLUBS = '♣';

    /** Available suits in a standard deck.
     * spades, diamonds, hearts, clubs
     */
    public static final Character[] Suits = {SPADES, DIAMONDS, HEARTS, CLUBS};

    /** Available ranks in a standard deck.
     *
     * A, 2-9, T (10), J, Q, K
     */
    public static final Character[] Ranks = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};

    /** The rank of the current card.
     *
     * (ex. 'A', 'T', '7', null for empty card)
     */
    private Character rank;

    /** The suit of the current card.
     * (ex. CLUBS, DIAMONDS, or null for empty card)
     */
    private Character suit;

    /**
     * Explicit default constructor which produces an empty Card
     * with no rank or suit.
     *
     * The fields 'rank' and 'suit' are initialized to null.
     */
    public Card()
    {
        rank = null;
        suit = null;

    }

    /**
     * Parameterized constructor for the card class.
     * Accepts a rank and suit to create a valid card object.
     *
     * @param rank the rank of the card
     * @param suit the suit of the card
     */
    public Card(Character rank, Character suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return the current rank, or null if the card is empty
     */
    public Character getRank()
    {
        return rank;
    }

    /**
     * Gets the suit of the card.
     *
     * @return the current suit, or null if the card is empty
     */
    public Character getSuit()
    {
        return suit;
    }

    /**
     * Returns a String representation of the rank and suit
     * combined to represent a Card.
     *
     * If the card is empty, a placeholder is returned.
     *
     * @return a String displaying the rank and suit of the card
     */
    public String toString()
    {
        if (rank == null || suit == null)
        {
            return "--";
        }
        return rank.toString() + suit.toString();
    }

    /**
     * Resets the card to an empty state, without
     * a rank or suit.
     */
    public void resetCard()
    {
        this.rank = null;
        this.suit = null;
    }

    /**
     * Compares two cards by rank and suit.
     * The comparison is done using the respective order of the rank and suit in their arrays.
     * Ties are determined by the ordering of Suits.
     *
     * @param firstCard the first card to compare
     * @param secondCard the second card to compare
     * @return a negative number when firstCard < secondCard,
     * zero if equal, positive if firstCard > secondCard.
     */
    public static int compare(Card firstCard, Card secondCard)
    {
        int rank1 = index(Ranks, firstCard.rank);
        int rank2 = index(Ranks, secondCard.rank);

        if (rank1 != rank2)
        {
            return rank1 - rank2;
        }

        int suit1 = index(Suits, firstCard.suit);
        int suit2 = index(Suits, secondCard.suit);

        return suit1 - suit2;
    }

    /**
     * Returns the index of a value in the specified array.
     * If the value is not found/null, -1 is returned
     * @param arr the array to be searched
     * @param value the value to locate within the array
     *
     * @return the index of the value within the array or -1 if null
     */
    private static int index(Character[] arr, Character value)
    {
        if (value == null)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].equals(value))
            {
                return i;
            }
        }
        return -1;
    }
}