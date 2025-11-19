package src;

/**
 * Card.java
 * Author: Chris Silva
 * Assignment: Module 6 - Card Shuffler
 * Description: This program defined a Card class representing a playing card with its rank and suit.
 */

public class Card
{
    // field declarations
    public static final Character SPADES = '♠';
    public static final Character DIAMONDS = '♦';
    public static final Character HEARTS = '❤';
    public static final Character CLUBS = '♣';
    public static final Character[] Suits = {SPADES, DIAMONDS, HEARTS, CLUBS};
    public static final Character[] Ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    public Character rank;
    public Character suit;


    /**
     * Explicit default constructor for the Card class.
     * Sets a card to rank 'A' (Ace) and suit 'SPADES'
     */
    public Card()
    {
        rank = 'A';
        suit = SPADES;

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
     * @return the current rank
     */
    private Character getRank()
    {
        return rank;
    }

    /**
     * Gets the suit of the card.
     *
     * @return the current suit
     */
    private Character getSuit()
    {
        return suit;
    }

    /**
     * Returns a String representation of the Card object.
     *
     * @return a String displaying the rank and suit of the card
     */
    public String toString()
    {
        return rank.toString() + suit.toString();
    }

    /**
     * Resets the card to default values of Rank 'A' and Suit 'SPADES'.
     */
    public void resetCard()
    {
        this.rank = 'A';
        this.suit = SPADES;
    }
}