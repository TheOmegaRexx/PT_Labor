// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package fibonacci;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * 
 * 
 * Zur Fibonacci-Zahlen-Folge siehe auch http://de.wikipedia.org/wiki/Fibonacci-Folge.
 * Es soll die "urspüngliche" Fibonacci-Reihe implementiert werden!
 * f(1) = f(2) = 1
 * f(n) = f(n-1) + f(n-2)
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * {@link FibonacciNumberPrinter} - see task.
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class FibonacciNumberPrinter {
    
    /**
     * printing first Fibonacci numbers
     * 
     * @param wantedNumberOfFibonacciNumbers  number of Fibonacci numbers to be printed
     *                                        starting with first Fibonacci number
     */
    public void printFirstFibonacciNumbers( final int wantedNumberOfFibonacciNumbers ){
        int n = 0;
        int n2 = 1;
        int n3 = 0;
        for (int i = 0; i < wantedNumberOfFibonacciNumbers; i++) {
            

            if (i == wantedNumberOfFibonacciNumbers -1 )
                System.out.print(n3);
            else if(i == 0)
                System.out.print(n + ", "+ n2 +", ");
            else
                {System.out.print(n3 + ", ");}
                
            n3 = n + n2;
            n = n2;
            n2 = n3;
          }

        

        //
    }//method()
    
}//class
