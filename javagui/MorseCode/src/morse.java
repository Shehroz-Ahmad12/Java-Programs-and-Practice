import java.util.Scanner;
public class morse {
	public static void main(String[] args) {
		char[] letters = {' ','A','B','C','D','E','F','G','H','I','J','K',
				'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'1','2','3','4','5','6','7','8','9','0','.',','};          
		String[] morse = {" ",".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
				".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
				".----","..---","...--","....-",".....","-....","--...","---..","----.","-----",".-.-.-","--..--"};
		Scanner input = new Scanner (System.in);
		System.out.println("Press 1 to convert From English to Morse \nPress 2 to convert from Morse to English ");
		int sel = input.nextInt();
		if (sel==1) {
			EngToMorse(letters,morse);
		}
		else {
			MorseToEng(letters,morse);
		}
	
	
	}
	public static void EngToMorse(char[] letters,String[] morse) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Sentence to convert into morse: ");
		String sentence1=input.nextLine();
		
		String sentence=sentence1.toUpperCase();
		
		char[] sentenceArray=sentence.toCharArray();
		
		String encrypted="";
		int len=sentence.length();
		for (int i=0;i<len;i++) {
			for (int j=0;j<letters.length;j++) {
				if (sentenceArray[i]==letters[j]) {
					encrypted+=morse[j]+" ";
				}}}
		System.out.print(encrypted);
	}
	
	public static void MorseToEng(char[] letters,String[] morse) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter morse code ");
		String morseCode = input.nextLine();
		String[] morseCodeArray = morseCode.split(" ");
		System.out.println(morseCodeArray.length);
		for (int i=0;i<morseCodeArray.length;i++) {
			System.out.println(morseCodeArray[i]);
		}
		
		String decrypted="";
		for (int i=0;i<morseCodeArray.length;i++) {
			for (int j=0;j<morse.length;j++) {
				if (morseCodeArray[i]==morse[j]) {
					decrypted += letters[j]+" ";
				}
				else {
					System.out.println("Invalid Input");
					break;
				}
			}
		}
		System.out.println(decrypted);
		
	}
	
}
