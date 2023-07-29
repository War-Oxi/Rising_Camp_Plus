import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N =  Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int []scoreArr = new int[N];
		int maxScore = 0;
		int sumScore = 0;
		for(int i=0; i<N; i++){
			scoreArr[i] = Integer.parseInt(st.nextToken());
			sumScore += scoreArr[i];
			if(scoreArr[i] > maxScore) {
				maxScore = scoreArr[i];
			}
		}

//		System.out.println();
		bw.write(String.valueOf((double)sumScore / maxScore * 100 / N));
		bw.flush();
		bw.close();
	}
}