import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		M = M-45;

		if(M >= 0){
			System.out.println(H + " " + M);
		} else {
			M = 60 + M;
			H = H - 1;
			if(H < 0){
				H = 23;
			}
			System.out.println(H + " " + M);
		}
	}
}