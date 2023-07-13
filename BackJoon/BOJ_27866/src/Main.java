import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int numIn = sc.nextInt();

		System.out.println(str.charAt(numIn-1));
	}
}