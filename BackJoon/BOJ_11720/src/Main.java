import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfNumber = sc.nextInt();
		sc.nextLine();
		String numbers = sc.nextLine();

		int sum = 0;

		for (int i=0; i< numbers.length(); i++){
			sum += numbers.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}