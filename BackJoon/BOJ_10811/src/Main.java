import java.util.Scanner;

public class Main {
	static void swap(int []arr, int idx1, int idx2){
		if(idx1 == idx2) return;
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int []buckets = new int[N+1];
		for(int i=1; i<=N; i++){
			buckets[i] = i;
		}

		for(int i=0; i<M; i++){
			int startIdx = sc.nextInt();
			int endIdx = sc.nextInt();

			for(int start = startIdx; start<=(startIdx + endIdx) / 2; start++){
				swap(buckets, start, endIdx - (start - startIdx));
			}
		}
		for(int i=1; i<=N; i++){
			System.out.printf("%d ", buckets[i]);
		}
	}
}