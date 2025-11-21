package src;

import java.util.Arrays;
import java.util.random.RandomGenerator;

/**
 * This class represents a deck of 52 playing cards.
 *
 * The deck can be filled, shuffled, emptied, and report on
 * its original order before shuffling.
 */
public class Deck
{
    private final Card[] deck;       // An array of type Card[] to hold 52 Card objects
    private boolean shuffled;        // whether the deck has been shuffled
    private Card[] originalOrder;    // backup of original deck

    /**
     * Explicit default constructor for the Deck class.
     * Sets up an empty Deck object with an empty array with space for 52 Card objects
     */
    public Deck()
    {
        // number of cards
        int capacity = 52;
        this.deck = new Card[capacity];
        originalOrder = new Card[capacity];
        this.shuffled = false;
    }

    /**
     * Returns a copy of the original order
     *
     * @return a new array containing the cards in their original order,
     *         or an empty array if it has yet to be initialized
     */
    public Card[] getOriginalOrder()
    {
        if (originalOrder == null) {
            return new Card[0];
        }
        return Arrays.copyOf(originalOrder, originalOrder.length);
    }

    /**
     * Returns whether the current deck has been shuffled.
     *
     * @return True, if the deck has been shuffled
     *         else, false
     */
    public boolean isShuffled()
    {
        return shuffled;
    }

    /**
     * Updates the internal shuffled flag.
     *
     * @param shuffled Set to true when the deck is shuffled,
     *                 Otherwise, false
     */
    private void setShuffled(boolean shuffled)
    {
        this.shuffled = shuffled;
    }

    /**
     * Fills the deck with a complete set of 52 Card objects
     * in an ordered sequence of ranks and suits.
     *
     * This method saves a copy of the newly created set
     * and marks the deck as not shuffled by default.
     */
    public void fill()
    {
        int index = 0;
        for (Character rank : Card.Ranks)
        {
            for (Character suit : Card.Suits)
            {
                deck[index++] = new Card(rank, suit);
            }
        }
        // Store the original deck as a copy with its length explicitly defined
        originalOrder = Arrays.copyOf(deck, deck.length);
        // With the first deck having been dealt, shuffling has yet to occur
        setShuffled(false);
    }

    /**
     * Randomly shuffles the cards in the deck using the Fisher-Yates algorithm.
     *
     * After this method returns, the isShuffled() method returns true.
     */
    public void shuffle()
    {
        RandomGenerator random = RandomGenerator.getDefault();
        // Starting from the end of the deck (deck length - 1),
        // loop back sequentially (i--) for every integer (i, i > 0)
        for (int i = deck.length - 1; i > 0; i--)
        {
            // a random index within 0 and i is chosen from within the deck,
            // giving every card an equal chance of landing in every position
            int randIdx = random.nextInt(i+1);
            // save the card at index (i) into a temporary local variable
            Card temp = deck[i];
            // overwrite with (new) random card
            deck[i] = deck[randIdx];
            // assign card from index (i) to the random index
            deck[randIdx] = temp;
        }
        setShuffled(true);
    }

    /**
     * Returns a concatenated string representation of the current deck,
     * with no separators.
     *
     * @return a string representing all cards in the current deck in order.
     */
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (Card card : this.deck)
        {
            result.append(card.toString());
        }
        return result.toString();
    }

    /**
     * Prints the contents of an empty deck.
     *
     * If the deck has yet to be populated, an empty array is
     * returned.
     */
    public void printEmptyDeck()
    {
        boolean allNullVals = true;
        for (Card card : this.deck)
        {
            if (card != null)
            {
                allNullVals = false;
                break;
            }
        }
        if (allNullVals)
        {
            System.out.println("[]");
        }
        else
        {
            System.out.println(Arrays.toString(this.deck));
        }

    }
}