package src;

import java.util.random.RandomGenerator;

public class Deck
{

    private final Card[] deck;

    public Deck()
    {
        deck = new Card[52];
    }
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

    }
    public void shuffle()
    {
        RandomGenerator random  = RandomGenerator.getDefault();
        for (int i = deck.length - 1; i > 0; i--)
        {
            int randIdx = random.nextInt(i+1);
            // a temporary index is created to hold the contents of the value to be swapped
            //  deck[i] Card object is stored as a local variable
            Card temp = deck[i];
            deck[i] = deck[randIdx];
            deck[randIdx] = temp;
        }

    }
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (Card card : this.deck)
        {
            result.append(card.toString());
        }
        return result.toString();
    }
}