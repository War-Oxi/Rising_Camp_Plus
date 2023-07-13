import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] strIn = sc.nextLine().split(" ");
		int wordCount = 0;
		for(String ele : strIn){
//			System.out.println(ele);
			if (ele.equals("")) continue;
			wordCount++;
		}

		System.out.println(wordCount);
	}
}