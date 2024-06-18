package Package1;

public class Manager extends Employee {

	int hra = 2000;
	int salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Manager m = new Manager();
	
		m.salary = m.basicpay + m.hra;
		System.out.println("Salary of Manager" +m.salary);
		
	
	}

}
