package defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String... args) {
		StandardDeck deck = new StandardDeck();

		List<Card> cards = new ArrayList<>();
		Card card1 = new PlayingCard(Card.Suit.SPADES, Card.Rank.FOUR);
		cards.add(card1);
		Card card2 = new PlayingCard(Card.Suit.SPADES, Card.Rank.EIGHT);
		cards.add(card2);
		Card card3 = new PlayingCard(Card.Suit.HEARTS, Card.Rank.DEUCE);
		cards.add(card3);
		Card card4 = new PlayingCard(Card.Suit.HEARTS, Card.Rank.KING);
		cards.add(card4);
		Card card5 = new PlayingCard(Card.Suit.DIAMONDS, Card.Rank.ACE);
		cards.add(card5);
		Card card6 = new PlayingCard(Card.Suit.DIAMONDS, Card.Rank.NINE);
		cards.add(card6);
		Card card7 = new PlayingCard(Card.Suit.CLUBS, Card.Rank.EIGHT);
		cards.add(card7);
		Card card8 = new PlayingCard(Card.Suit.CLUBS, Card.Rank.SEVEN);
		cards.add(card8);
		deck.addCards(cards);

		deck.sort(Comparator
				.comparing(Card::getRank)
				.reversed()
				.thenComparing(Comparator.comparing(Card::getSuit)));
		deck.print();
	}
}
