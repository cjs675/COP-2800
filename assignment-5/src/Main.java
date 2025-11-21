package src;
/**
 * Main.java
 * Author: Chris Silva
 * Class: COP-2800
 * Assignment: Module 6 - Card Shuffler
 * Description: Test driver for the Deck and Card classes
 */

import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        // Empty card
        Card firstCard = new Card();
        System.out.println("\nFirst Card: " + firstCard.toString());

        // Populated cards
        Card secondCard = new Card('2', Card.DIAMONDS);
        System.out.println("\nSecond card: " + secondCard.toString());

        Card thirdCard = new Card('A', Card.SPADES);
        System.out.println("\nThird Card: " + thirdCard.toString());

        Card fourthCard = new Card('9', Card.DIAMONDS);
        System.out.println("\nFourth Card: " + fourthCard.toString());

        // Card comparison
        System.out.println("\nComparison of cards: ");
        // Store the result of the comparison as an integer value
        int firstComparison = Card.compare(secondCard, fourthCard);
        int secondComparison = Card.compare(thirdCard, fourthCard);

        if (firstComparison < 0)
        {
            System.out.println(secondCard + " is less than " + fourthCard);
        }
        else if (firstComparison > 0)
        {
            System.out.println(secondCard + " is greater than " + fourthCard);
        }
        else
        {
            System.out.println(secondCard + " is equal to " + fourthCard);
        }

        if (secondComparison < 0)
        {
            System.out.println(thirdCard + " is less than " + fourthCard);
        }
        else if (secondComparison > 0)
        {
            System.out.println(thirdCard + " is greater than " + fourthCard);
        }
        else
        {
            System.out.println(thirdCard + " is equal to " + fourthCard);
        }

        // Card reset
        secondCard.resetCard();
        thirdCard.resetCard();
        fourthCard.resetCard();

        System.out.println("\n------Cards after reset -------- " +
                          "\n" + secondCard.toString() +
                          "\n" + thirdCard.toString() +
                          "\n" + fourthCard.toString());

        // Create an object containing deck of cards
        // fill, shuffle then print the deck
        Deck emptyDeck = new Deck();

        // Empty deck
        System.out.println("\n\t|-------------------EMPTY DECK ------------------>\n");
        emptyDeck.printEmptyDeck();
        System.out.println("\nIs deck shuffled? " + emptyDeck.isShuffled());

        // Initial, populated deck of cards
        Deck newDeck = new Deck();
        newDeck.fill();
        System.out.println("\n\t|-------------------INITIAL DECK ------------------>\n");
        System.out.println(newDeck.toString());
        System.out.println("\nIs the new deck shuffled? " + newDeck.isShuffled());

        // Deck after shuffle
        newDeck.shuffle();
        System.out.println("\n\t|-------------------SHUFFLE TIME ------------------>\n");
        System.out.println(newDeck.toString());
        System.out.println("\nIs the new deck shuffled? " + newDeck.isShuffled());

        // Original order of deck
        System.out.println("\nOriginal Deck order before shuffle:\n");
        System.out.println(Arrays.toString(newDeck.getOriginalOrder()));
    }

}