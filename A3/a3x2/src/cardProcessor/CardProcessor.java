package cardProcessor;

import static cards.Card.*;
import static cards.Card.Constant.*;

import cards.*;
import cards.Card.*;

public class CardProcessor {
    
    /*
     * @param givenCards Array mit Karten, die in die Matrix einsortiert werden sollen
     * @return die gefüllte Kartenmatrix
     */
    public Card[][] generateCardMatrix(Card[] givenCards) {
        // Erstelle eine 4x13-Matrix, initialisiert mit null-Werten
        Card[][] matrix = new Card[4][13];
        
        // Durchlaufe alle übergebenen Karten
        for (Card card : givenCards) {
            if (card != null) {
                // Bestimme den Index der Farbe (0–3)
                int suitIndex = card.getSuit().ordinal();
                // Bestimme den Index des Rangs (0–12)
                int rankIndex = card.getRank().ordinal();
                // Füge die Karte an der entsprechenden Stelle in der Matrix ein
                matrix[suitIndex][rankIndex] = card;
            }
        }
        
        return matrix;
    }
    

    public void sortCards(final Card[] cardsToBeSorted) {
        // Erzeuge die Kartenmatrix
        Card[][] matrix = generateCardMatrix(cardsToBeSorted);
        
        int index = 0;
        
        // Durchlaufe die Ränge in absteigender Reihenfolge (ACE bis TWO)
        for (int rank = Rank.ACE.ordinal(); rank >= 0; rank--) {
            // Durchlaufe die Farben in der Reihenfolge CLUB, SPADES, HEART, DIAMOND
            for (int suit = 0; suit < 4; suit++) {
                // Prüfe, ob an dieser Position eine Karte in der Matrix vorhanden ist
                if (matrix[suit][rank] != null) {
                    // Füge die Karte in das Array ein
                    cardsToBeSorted[index++] = matrix[suit][rank];
                }
            }
        }
    }
}
