package Package1;

public class Teacher extends Employee{

	int da = 3000;
	int total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Teacher t = new Teacher();
	   t.total = t.basicpay + t.da;
	   
	   System.out.println("Salary of Teacher = " +t.total);
	}

}
