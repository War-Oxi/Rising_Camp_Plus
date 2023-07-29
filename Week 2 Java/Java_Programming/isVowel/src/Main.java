import java.sql.SQLOutput;

public class Main {
	public static void main(String[] args) {
		MyChar myChar = new MyChar('i');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.inConsonant());
		//'a', 'e', 'i', 'o', 'u' and Capitals
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		myChar.printLowerCaseAlphabets();
		myChar.printUpperCaseAlphabets();
	}
}