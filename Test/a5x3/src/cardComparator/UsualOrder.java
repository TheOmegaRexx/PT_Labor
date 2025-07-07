package cardComparator;

import java.util.Comparator;
import cards.Card;
import cards.Rank;
import cards.Suit;

public class UsualOrder implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        // First compare by suit
        int suitComparison = compareSuits(card1.getSuit(), card2.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        
        // If suits are equal, compare by rank
        return compareRanks(card1.getRank(), card2.getRank());
    }
    
    private int compareRanks(Rank rank1, Rank rank2) {
        // Custom order: Ace (highest), King, Queen, Jack, 10, 9, ..., 2 (lowest)
        return getRankPriority(rank2) - getRankPriority(rank1); // Note: reversed for descending order
    }
    
    private int compareSuits(Suit suit1, Suit suit2) {
        // Custom order: Clubs, Spades, Hearts, Diamonds
        return getSuitPriority(suit1) - getSuitPriority(suit2);
    }
    
    private int getRankPriority(Rank rank) {
        // Assign priorities where higher ranks have higher priority values
        switch (rank) {
            case ACE:   return 14;
            case KING:  return 13;
            case QUEEN: return 12;
            case JACK:  return 11;
            case TEN:   return 10;
            case NINE:  return 9;
            case EIGHT: return 8;
            case SEVEN: return 7;
            case SIX:   return 6;
            case FIVE:  return 5;
            case FOUR:  return 4;
            case THREE: return 3;
            case TWO:   return 2;
            default:    return 0; // should never happen
        }
    }
    
    private int getSuitPriority(Suit suit) {
        switch (suit) {
            case CLUBS:    return 0;
            case SPADES:   return 1;
            case HEARTS:   return 2;
            case DIAMONDS: return 3;
            default:       return 4; // should never happen
        }
    }
}