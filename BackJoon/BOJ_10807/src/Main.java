import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



		int N = Integer.parseInt(br.readLine());


		StringTokenizer st = new StringTokenizer(br.readLine());
		int []numArr = new int[N];

		for(int i=0; i<N; i++){
			numArr[i] = Integer.parseInt(st.nextToken());
		}

		int v = Integer.parseInt(br.readLine());

		int count=0;
		for(int ele : numArr){
			if(ele == v) count++;
		}

		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
	}
}