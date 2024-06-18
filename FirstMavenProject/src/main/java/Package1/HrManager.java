package Package1;

public class HrManager extends Manager {

	int ta = 2000;
	int totsalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HrManager hm = new HrManager();
		hm.totsalary = hm.basicpay + hm.hra + hm.ta;
		
		System.out.println("Salary of Hr Manager is" +hm.totsalary);
		
	}

}
