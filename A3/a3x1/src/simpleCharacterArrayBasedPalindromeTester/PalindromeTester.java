package simpleCharacterArrayBasedPalindromeTester;


/**
 * PalindromeTester - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 *
 */
public class PalindromeTester {
    
    /**
     * Die Methode isPalindrome prüft ob ein Palindrom vorliegt.
     * 
     * @param word      das zu überprüfende Wort.
     *
     * @return boolean  <code>true</code> falls das zu überprüfende Wort ein Palindrom ist,
     *                  andernfalls <code>false</code>.
     */
    //###
    //###
    //###
    //###         HIER kommt Ihr Code hin ;-)
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
    
    // Schreiben Sie eine Methode, die
    // o) ein Ergebnis vom Typ boolean abliefert
    // o) isPalindrome heißt
    // o) ein char[] als Parameter entgegen nimmt
    //    Der Parameter soll word heißen

    
        public boolean isPalindrome(char[] word) {
            for (int i=0; i<=word.length/2; i++) {
                if(!(word[i]==word[(word.length-1)-i])) return false;
        }
        return true;
    }
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
