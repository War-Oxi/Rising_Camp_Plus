import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String year = sc.next();
		int diff = 2541 - 1998;

		System.out.println(Integer.parseInt(year) - diff);
	}
}