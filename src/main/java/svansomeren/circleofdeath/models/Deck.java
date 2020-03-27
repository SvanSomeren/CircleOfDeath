package svansomeren.circleofdeath.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<String> types;
    private List<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        types = new ArrayList<>();
        types.add("Klaveren");
        types.add("Schoppen");
        types.add("Harten");
        types.add("Ruiten");
    }

    public void fillDeck(){
        for(int t = 0; t < 4; t++){
            cards.add(new Card(types.get(t), "2", "2 Adjes"));
            cards.add(new Card(types.get(t), "3", "Adje links"));
            cards.add(new Card(types.get(t), "4", "Adje rechts"));
            cards.add(new Card(types.get(t), "5", "Duim leggen")); //maken met sockets ofzo
            cards.add(new Card(types.get(t), "6", "1 min lullen uitdelen, andere persoon moet adten als hij faalt. 'Uh' mag niet gezegd worden"));
            cards.add(new Card(types.get(t), "7", "Juffen"));
            cards.add(new Card(types.get(t), "8", "Regel"));
            cards.add(new Card(types.get(t), "9", "Rijmen"));
            cards.add(new Card(types.get(t), "10", "Vraag stellen, geef zo snel mogelijk antwoord, als je faalt moet je adten"));
            cards.add(new Card(types.get(t), "B", "Regel"));
            cards.add(new Card(types.get(t), "V", "Categorie"));
            cards.add(new Card(types.get(t), "K", ""));
            cards.add(new Card(types.get(t), "A", "Andere kant op"));
        }
    }

    public Card getCard() throws Exception{
        Random random = new Random();
        int cardIndex = random.nextInt(cards.size());
        Card card = cards.get(cardIndex);
        cards.remove(cardIndex);
        return card;
    }
}
