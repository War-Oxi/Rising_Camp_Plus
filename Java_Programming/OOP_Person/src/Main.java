public class Main {
	public static void main(String[] args) {
//		Student student = new Student();
		/*
		Person person = new Person();
		person.setName("Ranga");;
		person.setEmail("ranga@in28minutes.com");
		person.setPhoneNumber("123-456-7890");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		*/

		Employee employee = new Employee("Ranga", "Programmer Analyst");
//		employee.setName("Ranga");
		employee.setEmail("ranga@in28minutes.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeeGrade('A');
//		employee.setTitle("Programmer Analyst");
		employee.setEmployerName("Alex");

		System.out.println(employee);
	}
}