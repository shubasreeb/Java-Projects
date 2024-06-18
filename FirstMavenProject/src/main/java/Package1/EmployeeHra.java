package Package1;

public class EmployeeHra extends EmployeeSalary {
	
     double hra,pf;
	
	public void calc() {
		
		hra = (basicpay * 5)/100;
		pf = (basicpay * 20)/100;
	}
}


