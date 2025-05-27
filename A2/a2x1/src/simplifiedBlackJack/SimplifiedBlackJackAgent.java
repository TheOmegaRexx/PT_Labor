// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  (Lukas Rieder)
 * @version (a version number or a date)
 */
public class SimplifiedBlackJackAgent {
    
    // Ersetzen Sie diesen Kommentar durch Ihren Code
    // oder falls kein Code noetig ist, loeschen diesen Kommentar einfach.
    // Hier waere die Stelle fuer moegliche Zustandsvariablen, Exemplarvariablen
    // bzw. Objekt-spezifische Variablen oder einen Konstruktor,
    // sofern derartiges benoetigt wird.
    // Es ist Ihre Entscheidung und sie sollte Sinn machen.
    
    
    
    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###
        //###
        //###
        //###           HIER kommt Ihr Code hin
        //###
        //###                    VVVV
        //###                    VVVV
        //###                    VVVV
        //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
        //###            VVVVVVVVVVVVVVVVVVVV
        //###               VVVVVVVVVVVVVV
        //###                  VVVVVVVV
        //###                     VV
        Card card;
        Deck deck = new Deck();
        int myPoints = 0;
        int rank;
        
        while (myPoints < 17) {
            // Die Idee ist, so lange zu ziehen, wie die Punkte unter 17 sind.
            card = deck.deal(); // Zieht die nächste Karte
            rank = card.getRank().value(); // Art und Wert der Karte werden bestimmt

            if (rank == 14) {
                // Sonderfall: Ass – der Punktwert soll 11 statt 14 sein
                rank = 11;
            } else if (rank > 10) {
                // Alle Bildkarten außer Ass sollen den Punktwert 10 erhalten
                rank = 10;
            }

            myPoints += rank; // Der Wert der gezogenen Karte wird zu den Punkten addiert
            System.out.println(card);
            System.out.println(myPoints);

            if (myPoints > 21) System.out.println("LOST"); // Spieler hat verloren
        }

    		

    	
    	
    	
        	
        	
        	
        //}
        
        
        //...
        
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.flush();
    }//method()
    
}//class
