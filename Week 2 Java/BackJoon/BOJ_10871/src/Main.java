import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		while(st.hasMoreTokens()){
			int cmp = Integer.parseInt(st.nextToken());
			if(cmp < X)
				bw.write(Integer.toString(cmp) + " ");
		}
		bw.flush();
		bw.close();
	}
}