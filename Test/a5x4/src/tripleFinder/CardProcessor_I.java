package tripleFinder;

import java.util.*;
import cards.Card;

public class CardProcessor_I implements CardProcessor_I {

    // Map zur Speicherung der Karten nach Rang (hier als Object)
    private final Map<Object, List<Card>> rankToCards = new HashMap<>();

    // Leerer Konstruktor
    public CardProcessor_I() {}

    @Override
    public Object process(final Card card) {
        if (card == null) return null;

        Object rank = card.rank(); // Rang als generisches Objekt

        // Liste für diesen Rang holen oder neu anlegen
        List<Card> cardsOfRank = rankToCards.computeIfAbsent(rank, k -> new ArrayList<>());
        cardsOfRank.add(card);

        // Drilling erkannt?
        if (cardsOfRank.size() == 3) {
            List<Card> drilling = new ArrayList<>(cardsOfRank);
            rankToCards.remove(rank); // Entfernen nach Fund
            return drilling;
        }

        return null;
    }

    @Override
    public void reset() {
        rankToCards.clear();
    }
}
