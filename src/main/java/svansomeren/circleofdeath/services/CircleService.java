package svansomeren.circleofdeath.services;

import svansomeren.circleofdeath.models.Card;
import svansomeren.circleofdeath.models.Deck;

public class CircleService {

    private Deck deck;

    public CircleService(){
        deck = new Deck();
    }

    public void startGame(){
        deck.fillDeck();
    }

    public Card pickCard(){
        return deck.getCard();
    }
}
