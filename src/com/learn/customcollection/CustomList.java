package com.learn.customcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.learn.card.Card;

public class CustomList {

	public static void main(String[] args) {
		Collection<String> list =  new ArrayList<String>();
		Collection<String> list1 = new TreeSet<String>();
		Collection<String> list3 = new HashSet<String>();
		
		List<Card> deck = Card.getStandardDeck();
		Card.printDeck(deck);
		
	}

}
