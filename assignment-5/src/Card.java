package src;

public class Card
{
    public static final Character SPADES = '♠';
    public static final Character DIAMONDS = '♦';
    public static final Character HEARTS = '❤';
    public static final Character CLUBS = '♣';
    public static final Character[] Suits = {SPADES, DIAMONDS, HEARTS, CLUBS};
    public static final Character[] Ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    public Character rank;
    public Character suit;

    public Card()
    {
        rank = 'A';
        suit = SPADES;

    }
    public Card(Character rank, Character suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString()
    {
        return rank.toString() + suit.toString();
    }

}