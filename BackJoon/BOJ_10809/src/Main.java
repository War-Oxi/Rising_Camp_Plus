import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String strIn = br.readLine();

		for(char i='a'; i<='z'; i++){
			bw.write(strIn.indexOf(i) + " ");
		}
		bw.flush();
		bw.close();
	}
}