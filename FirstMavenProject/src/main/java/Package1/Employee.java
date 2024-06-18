package Package1;

public class Employee {
	
	int empid  = 1;
	String name = "Shubasree";
	int basicpay = 15000;
	
	Employee(){
		
		System.out.println("Inside Employee Constructor");
	}
	
	
	public static void main(String[] args) {

		Employee e = new Employee();
		System.out.println("Parent Class");
		System.out.println("Employee id = " +e.empid);
		System.out.println("Employee name= " +e.name);
		System.out.println("Employee basic salary = " +e.basicpay);
	}
	
	public void data() {
		
		System.out.println("Name " +name);
	}

}
