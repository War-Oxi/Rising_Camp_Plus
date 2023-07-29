import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());


		st = new StringTokenizer(br.readLine());
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		while(st.hasMoreTokens()){
			int cmpNum = Integer.parseInt(st.nextToken());

			if(cmpNum < minValue)
				minValue = cmpNum;
			if(cmpNum > maxValue)
				maxValue = cmpNum;
		}

		bw.write(Integer.toString(minValue) + " " + Integer.toString(maxValue));
		bw.flush();
		bw.close();
	}
}