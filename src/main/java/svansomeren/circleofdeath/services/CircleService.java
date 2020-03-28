package svansomeren.circleofdeath.services;

import svansomeren.circleofdeath.models.Card;
import svansomeren.circleofdeath.models.Deck;

import java.util.ArrayList;
import java.util.List;

public class CircleService {

    private Deck deck;
    private List<Card> cardHistory;

    public CircleService(){
        deck = new Deck();
        cardHistory = new ArrayList<>();
    }

    public void startGame(){
        deck.fillDeck();
    }

    public Card pickCard() throws Exception{
        return deck.getCard();
    }
}
