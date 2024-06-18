
package Package1;
import java.util.Scanner;
public class EmployeeSalary {
	
	String empname;
	int basicpay, ded, bonus;
	
	
	public void get() {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter employee name");
		empname = s.next();
		System.out.println("Enter employee basicpay");
		basicpay = s.nextInt();
		System.out.println("Enter employee deduction");
		ded = s.nextInt();
		System.out.println("Enter employee bonus");
		bonus = s.nextInt();

		
	}

}



