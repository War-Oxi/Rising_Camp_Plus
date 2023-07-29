import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strIn = sc.nextLine();

		int timeCount = 0;
		for(int i=0; i<strIn.length(); i++){
			if(strIn.charAt(i) < 'A')
				timeCount += 2;
			else if(strIn.charAt(i) < 'D')
				timeCount += 3;
			else if(strIn.charAt(i) < 'G')
				timeCount += 4;
			else if(strIn.charAt(i) < 'J')
				timeCount += 5;
			else if(strIn.charAt(i) < 'M')
				timeCount += 6;
			else if(strIn.charAt(i) < 'P')
				timeCount += 7;
			else if(strIn.charAt(i) < 'T')
				timeCount += 8;
			else if(strIn.charAt(i) < 'W')
				timeCount += 9;
			else if(strIn.charAt(i) <= 'Z')
				timeCount += 10;
		}
		System.out.println(timeCount);
	}
}