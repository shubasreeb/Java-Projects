package Package1;

public class EmployeeSlip extends EmployeeHra{
  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    double total;
			EmployeeSlip ep = new EmployeeSlip();
			
			ep.get();
            ep.calc();
						
			total = ep.basicpay + ep.hra - ep.pf - ep.ded + ep.bonus;
					
			System.out.println("Basic pay of Employee = " +ep.basicpay);
			System.out.println("Deduction of Employee = " +ep.ded);
			System.out.println("HRA of Employee = " +ep.hra);
			System.out.println("PF of Employee = " +ep.pf);
			System.out.println("Bonus of Employee = " +ep.bonus);
			System.out.println("Total Salary of Employee = " +total);
			
	}

}

