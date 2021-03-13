package chap03;

import java.util.List;

public class Participant {
    private final Cards cards;

    public Participant(Cards cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards.toList();
    }
}
