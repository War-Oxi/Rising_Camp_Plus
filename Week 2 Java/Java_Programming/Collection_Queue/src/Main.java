import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.List;

class StringLengthComparator implements Comparator<String>{ // 짧은 문자 순서대로

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
}

public class Main {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monky", "Cat"));

//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		while(queue.peek() != null){
			System.out.println(queue.poll());
		}
	}
}