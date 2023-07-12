import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int []bucket = new int[N];

		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int minRange, maxRange, ballNum;
			minRange = Integer.parseInt(st.nextToken());
			maxRange = Integer.parseInt(st.nextToken());
			ballNum = Integer.parseInt(st.nextToken());

			for(int j=minRange; j<=maxRange; j++){
				bucket[j-1] = ballNum;
			}
		}

		for(int ele : bucket){
			bw.write(ele + " ");
		}
		bw.flush();
		bw.close();
	}
}