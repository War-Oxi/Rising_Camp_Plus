import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List list = List.of("123", '1', 12, 1.0);
		Iterator itr = list.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next().getClass().getName() );
		}
	}
}