package model;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    private List<Card> cards = new ArrayList<>();

    public CardDeck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

}
