package eduSMG;

public class TestPersons {

	public static void main(String[] args) {
		Person person = new Person(
									"Alex",
									"zhk. Lagera",
									"0877777777",
									"alex@gmail.com");
		
		Student student = new Student(
				"Radi",
				"zhk. Mladost",
				"0987667899",
				"radi@b.com",
				Student.FRESH_MAN);
		
		Employee employee = new Employee(
				"Gosho",
				"zhk. Drujba",
				"0000077777",
				"gosho@gmail.com",
				"SMG",
				1750
				);
		
		Faculty faculty = new Faculty(
				"Pesho",
				"zhk. Drujba 2",
				"0003454677",
				"pesho@gmail.com",
				"BAN",
				2500,
				"10:00 - 18:00",
				"Professor");
		
		Staff staff = new Staff(
				"Ivan",
				"zhk. Nadezhda 2",
				"0123456789",
				"ivan@gmail.com",
				"Su",
				3000,
				"Decan");
				
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
