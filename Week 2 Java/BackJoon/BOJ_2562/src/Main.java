import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int maxNum = 0;
		int whereMaxNum = 0;
		for(int i=1; i<=9; i++){
			int inputNum = Integer.parseInt(br.readLine());
			if(inputNum < maxNum) continue;
			maxNum = inputNum;
			whereMaxNum = i;
		}

		bw.write(maxNum + "\n" + whereMaxNum);
		bw.flush();
		bw.close();
	}
}