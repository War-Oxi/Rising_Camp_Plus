import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Student> students = List.of(
			new Student(1, "Ranga"),
			new Student(3, "Tanga"),
			new Student(2, "Manga")
		);

		List<Student> studentsAl = new ArrayList<>(students);


		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
	}
}