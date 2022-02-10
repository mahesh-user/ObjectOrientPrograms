package com.bridgelabz;

public class DeckOfCards {
    String [] deck = new String [52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String [][] playerCards = new String [4][9];


    public void getCards() {
        int   k = 0;
        for (int i = 0; i < suits .length; i++) {
            for (int j = 0; j < ranks .length; j++) {
                deck [k] = suits [i] + " " + ranks [j];
                k++;
            }
        }
    }

    public String[] shuffleCards(){
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        return deck;
    }

    public void displayCard(String[] deck) {
        int k=0;
        for(int i=0;i<4;i++) {
            System.out.println("Player"+(i+1)+" :-");
            System.out.println();
            for(int j=0;j<9;j++) {
                playerCards[i][j]= deck[k];
                System.out.println(playerCards[i][j]);
                k++;
            }
            System.out.println();
        }
    }
}
