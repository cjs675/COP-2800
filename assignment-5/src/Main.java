package src;

/**
 * Main.java
 * Author: Chris Silva
 * Class: COP-2800
 * Assignment: Module 6 - Card Shuffler
 * Description: Test driver for Deck and Card objects
 */
public class Main
{
    public static void main(String[] args)
    {
        // Create an object containing deck of cards
        // fill, shuffle then print the deck
        Deck emptyDeck = new Deck();
        // Empty deck
        System.out.println("\n\t|-------------------EMPTY DECK ------------------>");
        emptyDeck.printEmptyDeck();

        // Initial, populated deck of cards
        Deck newDeck = new Deck();
        newDeck.fill();
        System.out.println("\n\t|-------------------INITIAL DECK ------------------>");
        System.out.println(newDeck.toString());

        // Deck after shuffle
        newDeck.shuffle();
        System.out.println("\n\t|-------------------SHUFFLE TIME ------------------>");
        System.out.println(newDeck.toString());


    }

}