// This source code is UTF-8 coded - see https:/stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package patternBasedArrayProcessor;

/**
 * ArrayProcessor - see task
 *
 * @author (your name(s))
 * @version (a version number or a date)
 *
 */
public class ArrayProcessor {

	int summe = 0;
	int patternHight = 4;
	int startPosition = 0;

	;

	public long process(long[][] theArray) {

		boolean[][] pattern = {
				{ false, true, true },
				{ true, false, false, true },
				{ true, false, false, true },
				{ false, true, true }, };

		int row = 0;
		int x = 0;
		while (theArray.length >= patternHight + row) {

			// solange das pattern passt
			// summe addieren
			// und nach rechts verschieben

			if (theArray[row].length - 1 >= pattern[0].length - 1 + x
					&& theArray[row + 1].length - 1 >= pattern[1].length - 1 + x
					&& theArray[row + 2].length - 1 >= pattern[2].length - 1 + x
					&& theArray[row + 3].length - 1 >= pattern[3].length - 1 + x) {

				// for(int x=0;x<theArray.length-patternHight;) {

				summe += theArray[row][x + 1] + theArray[row][x + 2] + theArray[row + 1][x] + theArray[row][x + 3]
						+ theArray[row + 2][x] + theArray[row][x + 3] + theArray[row + 3][x + 1] + theArray[row][x + 2];
				x++;
				// }//for

			} // if
			else {
				row++;
				y++;
			} // else

			//row++;
		} // while
		return summe;

		// <<<=== Diese Zeile ist falsch! bzw. nur ein Platzhalter um den Compiler
		// gluecklich zu machen. Die Zeile muss sinnvoll ersetzt werden.
	}// method()

	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	// Führen Sie Änderungen oberhalb dieser Zeilen durch.
	// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

}// class
