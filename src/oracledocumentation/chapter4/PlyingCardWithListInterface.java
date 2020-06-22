package oracledocumentation.chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlyingCardWithListInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = {scanner.nextLine(), scanner.nextLine()};
        int numHands = Integer.parseInt(array[0]);
        int cardsPerHand = Integer.parseInt(array[1]);

        // Make a normal 52-card deck.
        String[] suit = new String[]{
                "spades", "hearts",
                "diamonds", "clubs"
        };
        String[] rank = new String[]{
                "ace", "2", "3", "4",
                "5", "6", "7", "8", "9", "10",
                "jack", "queen", "king"
        };

        List<String> deck = new ArrayList<>();
        for (String s : suit)
            for (String value : rank) deck.add(value + " of " + s);

        // Shuffle the deck.
        Collections.shuffle(deck);

        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Not enough cards.");
            return;
        }

        for (int i = 0; i < numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
    }

    public static <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<>(handView);
        handView.clear();
        return hand;
    }
}