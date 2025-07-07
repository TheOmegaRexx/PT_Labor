// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
import java.util.*;


/**
 * CardProcessor removing duplicates - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class CardProcessor {
    
	public Card[] removeDuplicates(Card[] givenCards) {
	    HashSet<Card> cardPile = new HashSet<Card>(Arrays.asList(givenCards));

	    Card[] uniqueCards = new Card[cardPile.size()];
	    return cardPile.toArray(uniqueCards);
	}

}//class
