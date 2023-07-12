public class MyChar {
	private char myChar;
	public MyChar(char c) {
		this.myChar = c;
	}
	public boolean isVowel() {
//		if(myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' ||
//			myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U' )
//			return true;
//		else
//			return false;

		// 더 나은 버전 Character.toUpperCase(ch) 메서드 사용
		if(Character.toUpperCase(myChar) == 'A' ||
			Character.toUpperCase(myChar) == 'E' ||
			Character.toUpperCase(myChar) == 'I' ||
			Character.toUpperCase(myChar) == 'O' ||
			Character.toUpperCase(myChar) == 'U' )
			return true;
		else
			return false;
	}
	public boolean inConsonant(){
		if(isAlphabet() && !isVowel())
			return true;
		else
			return false;
	}
	public boolean isNumber() {
		if('0' <= myChar && myChar <= '9') {
			return true;
		} else
			return false;
	}

	public boolean isAlphabet() {
		if(65 <= myChar && myChar <= 122)
			return true;
		else
			return false;
	}

	public static void printLowerCaseAlphabets() {
		for(char ch = 'a'; ch <= 'z'; ch++){
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for(char ch = 'A'; ch <= 'Z'; ch++){
			System.out.println(ch);
		}
	}
}
