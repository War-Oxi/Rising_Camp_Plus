import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> remainingNumArr = new ArrayList<>();

		int B = 42;

		for(int i=0; i<10; i++){
			int A = sc.nextInt();
			int remainingNum = A % 42;

			if(!remainingNumArr.contains(remainingNum))
				remainingNumArr.add(remainingNum);
		}

		System.out.println(remainingNumArr.size());
	}
}