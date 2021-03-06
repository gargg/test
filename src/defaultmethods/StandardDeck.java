package defaultmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StandardDeck implements Deck {
	private List<Card> entireDeck = new ArrayList<>();

	@Override
	public List<Card> getCards() {
		return entireDeck;
	}

	@Override
	public Deck deckFactory() {
		return null;
	}

	@Override
	public int size() {
		return entireDeck.size();
	}

	@Override
	public void addCard(Card card) {
		entireDeck.add(card);
	}

	@Override
	public void addCards(List<Card> cards) {
		entireDeck.addAll(cards);
	}

	@Override
	public void addDeck(Deck deck) {
		entireDeck.addAll(deck.getCards());
	}

	@Override
	public void shuffle() {

	}

	@Override
	public void sort() {
		Collections.sort(entireDeck);
	}

	@Override
	public void sort(Comparator<Card> c) {
		Collections.sort(entireDeck, c);
	}

	@Override
	public String deckToString() {
		return null;
	}

	@Override
	public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
		return null;
	}

	public void print() {
		for (Card card : entireDeck) {
			System.out.println(card.getSuit().text() + card.getRank().text());
			System.out.println("/n");
		}
	}
}
