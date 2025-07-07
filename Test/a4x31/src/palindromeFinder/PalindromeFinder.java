package palindromeFinder;

public class PalindromeFinder {
	public String text;
	
	// Parameterloser Konstruktor
	public PalindromeFinder() {

	}

	// Konstruktor mit String-Parameter
	public PalindromeFinder(String text) {
		this.text=text;

	}

	// Methode zur Bestimmung des längsten Palindroms im Text
	public String getLongestPalindrome() {
		int kandidatenLänge = text.length();
		int kanidatenStart = 0;
		int kanidatenRedu	= 0;
		while (kandidatenLänge>=0) {

		    //???
			while (!isPalindrome(text.substring(kanidatenStart, kandidatenLänge+1))){
			    
				kandidatenLänge--;
				while ();
				kandidatenLänge--;
				
			}
			
			
			kandidatenLänge--;
		}
		assert false : "Unerwarter Kontrollfluss";
		return "";  // unnötig - nur für Compiler

	}

	// Methode zur Bestimmung des längsten Palindroms im Text
	public String getText() {
		return text;
	}
	public String setText(String text) {
		return this.text=text;
	}

	public boolean isPalindrome(String word) {
		for (int i = 0; i <= word.length() / 2; i++) {
			if (!(word.charAt(i) == word.charAt((word.length() - 1) - i)))
				return false;
		}
		return true;
	}
}
