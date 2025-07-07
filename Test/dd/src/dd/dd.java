package dd;

public class dd {
	

	public boolean isPalindrome(String word) {
		for (int i = 0; i <= word.length() / 2; i++) {
			if (!(word.charAt(i) == word.charAt((word.length() - 1) - i)))
				return false;
		}
		return true;
}};

public class Main {
    public static void main(String[] args) {
        dd palindromeChecker = new dd(); // Objekt der Klasse dd erstellen
        
        String testWord = "madam"; // Testwort
        boolean result = palindromeChecker.isPalindrome(testWord); // Methode aufrufen
        
        if (result) {
            System.out.println(testWord + " ist ein Palindrom!");
        } else {
            System.out.println(testWord + " ist kein Palindrom!");
        }
    }
}
