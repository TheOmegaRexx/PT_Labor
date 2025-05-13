// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package theLastThree;
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
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * The {@link LastThree} - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class LastThree {
    
    // Zustandsvariablen zum Merken der letzten drei Werte
    int first;   // ältester gespeicherter Wert
    int second;  // mittlerer gespeicherter Wert
    int third;   // zuletzt gespeicherter Wert
    int count;   // Anzahl bisher verarbeiteter Werte

    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){
        // Initiale Werte setzen
        first = 0;
        second = 0;
        third = 0;
        count = 0;
    }

    /**
     * print the last three numbers/values
     */
    public void printLastThree(){
        if (count == 0) {
            System.out.println("nix");
        } else if (count == 1) {
            System.out.printf("[%d]\n", third);
        } else if (count == 2) {
            System.out.printf("[%d  %d]\n", second, third);
        } else {
            System.out.printf("[%d  %d  %d]\n", first, second, third);
        }
    }

    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue(int value){
        // Schiebe die alten Werte nach
        if (count >= 2) {
            first = second;
        }
        if (count >= 1) {
            second = third;
        }
        third = value;

        if (count < 3) {
            count++;
        }
    }
}
