import java.util.*;
import java.io.*;

public class Main {
	public static void swap(int[] arrIn, int idx1, int idx2){
		idx1 -= 1;
		idx2 -= 1;
		int tmp = arrIn[idx1];
		arrIn[idx1] = arrIn[idx2];
		arrIn[idx2] = tmp;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int []bucket = new int[N];
		for(int i=0; i<N; i++){
			bucket[i] = i+1;
		}

		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			swap(bucket, first, second);
		}

		for(int ele : bucket){
			bw.write(ele + " ");
		}

		bw.flush();
		bw.close();
	}
}