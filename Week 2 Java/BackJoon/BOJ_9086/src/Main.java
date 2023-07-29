import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=testCase; i++){
			String strIn = sc.nextLine();

			System.out.print(strIn.charAt(0));
			System.out.println(strIn.charAt(strIn.length()-1));
		}
	}
}