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
        Deck deck = new Deck();

        // Initial deck of cards
        deck.fill();
        System.out.println("\n\t|-------------------INITIAL DECK ------------------>");
        System.out.println(deck.toString());

        // Deck after shuffle
        deck.shuffle();
        System.out.println("\n\t|-------------------SHUFFLE TIME ------------------>");
        System.out.println(deck.toString());



    }

}