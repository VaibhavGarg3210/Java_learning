package com.learn.card;

import java.util.ArrayList;
import java.util.List;

import com.learn.card.Card.Suit;

public record Card(Suit suit, String face, int rank) {

	public enum Suit {
		CLUB, DIAMOND, HEART, SPADE;

		public char getImage() {
			return (new char[] { 9827, 9830, 9829, 9824 })[this.ordinal()];
		}
	}

	@Override
	public String toString() {
		int index = face.equals("10") ? 2 : 1;
		String faceString = face.substring(0, index);
		return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
	}

	public static Card getNumericCard(Suit suit, int cardNumber) {
		if (cardNumber > 1 && cardNumber < 11) {
			return new Card(suit, String.valueOf(cardNumber), cardNumber - 2);
		}
		System.out.println("Invalid Number Card selected");
		return null;
	}

	public static Card getFacedCard(Suit suit, char chars) {
		int charIndex = "JQKA".indexOf(chars);
		if (charIndex > -1) {
			return new Card(suit, "" + chars, charIndex + 9);
		}
		System.out.print("Invalid Face Card Selected");
		return null;
	}

	public static List<Card> getStandardDeck() {
		List<Card> deck = new ArrayList<Card>(52);
		for (Suit suit : Suit.values()) {
			for (int i = 2; i <= 10; i++) {
				deck.add(getNumericCard(suit, i));
			}
			for (char c : new char[] { 'J', 'Q', 'K', 'A' }) {
				deck.add(getFacedCard(suit, c));
			}
		}
		return deck;
	}

	public static void printDeck(List<Card> deck, String description, int rows) {
		System.err.println("--------------------");
		if (description != null) {
			System.err.println(description);
		}
		int cardsInRow = deck.size() / rows;
		for (int i = 0; i < rows; i++) {
			int startIndex = i * cardsInRow;
			int endIndex = startIndex + cardsInRow;
			deck.subList(startIndex, endIndex).forEach(c -> System.err.print(c + " "));
			System.err.println();
		}
	}

	public static void printDeck(List<Card> deck) {
		printDeck(deck, "Current Deck", 4);
	}

}
