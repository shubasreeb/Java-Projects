package Package1;

public class Developer extends Employee{

	int overtime = 1000;
	int tot;
	
	Developer(){
		
		//super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Developer d = new Developer();
        d.tot = d.basicpay + d.overtime;
        
        System.out.println("Salary of developer " +d.tot);
		d.display();	
	
	}
	
	public void display() {
		
		System.out.println(super.basicpay);	
		super.data();
		}

}
