import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = Integer.parseInt(sc.nextLine());

		for(int i=1; i<=testCase; i++){
			int repeatNum = sc.nextInt();
			String strIn = sc.nextLine();

			for(int startIdx=1; startIdx<strIn.length(); startIdx++){
				for(int j=0; j<repeatNum; j++){
					System.out.print(strIn.charAt(startIdx));
				}
			}
			System.out.println();
		}
	}
}