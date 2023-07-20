import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String str = "This is great things";

//		str = str.toLowerCase();
//		System.out.println(str);

		Map<Character, Integer> alphabet = new HashMap<>();
		for (int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' ') continue;
			if(!alphabet.containsKey(str.charAt(i))){
				alphabet.put(str.charAt(i), 1);
			}
			else {
//				Integer tmpNum = alphabet.get(str.charAt(i)) + 1;
				alphabet.replace(str.charAt(i), alphabet.get(str.charAt(i)) +1);
			}
		}

		System.out.println(alphabet);
	}
}