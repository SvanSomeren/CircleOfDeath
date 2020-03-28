package svansomeren.circleofdeath.services;

import svansomeren.circleofdeath.models.Card;
import svansomeren.circleofdeath.models.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircleService {

    private Deck deck;
    private List<Card> cardHistory;

    public CircleService(){
        deck = new Deck();
        cardHistory = new ArrayList<>();
    }

    public List<Card> startGame(){
        deck.fillDeck();
        List<Card> cards = deck.getCards();
        Collections.shuffle(cards);
        return cards;
    }

    public Card pickCard() throws Exception{
        return deck.getCard();
    }
}
