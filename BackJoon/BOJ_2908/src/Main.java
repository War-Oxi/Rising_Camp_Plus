import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringTokenizer st = new StringTokenizer(sc.nextLine());
		String num1 = st.nextToken();
		String num2 = st.nextToken();

		String reverseNum1 = "";
		String reverseNum2 = "";
		for(int i=num1.length()-1; i>=0; i--){
			reverseNum1 += num1.charAt(i);
			reverseNum2 += num2.charAt(i);
		}

		System.out.println(Integer.parseInt(reverseNum1) > Integer.parseInt(reverseNum2)? reverseNum1 : reverseNum2);
	}
}