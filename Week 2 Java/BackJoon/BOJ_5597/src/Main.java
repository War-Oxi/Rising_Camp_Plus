import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] checklist = new boolean[30];
		Arrays.fill(checklist, false);
		for(int i=0; i<28; i++){
			checklist[sc.nextInt()-1] = true;
		}

		for(int i=0; i<30; i++){
			if(!checklist[i]){
				System.out.println(i+1);
			}
		}
	}
}