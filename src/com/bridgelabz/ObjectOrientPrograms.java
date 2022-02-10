package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        DeckOfCards deckcard = new DeckOfCards ();
        deckcard.getCards();
        String []deck = deckcard.shuffleCards();
        deckcard.displayCard(deck);

    }
}
