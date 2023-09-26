package hw10Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Arman");
		employee.setAge(22);
		employee.setSex('M');
		employee.setCitizen(false);
		System.out.println("My name is " + employee.getName() + "\nI am "+ employee.getAge() + " years old"+"\nMy Gender " +employee.getSex()+"\nMy citizenship status " + employee.isCitizen());
	}

}
