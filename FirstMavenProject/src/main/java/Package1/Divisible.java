package Package1;

public class Divisible extends Addition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Divisible d = new Divisible();
	    d.display();
		

	}
	
	public void display() {
		
		super.add();
		int result = super.total;
		
		if(result%10 == 0) {
			
			System.out.println("It is divisible");
		}
		else {
			
			System.out.println("It is not divisible");
		}	
			
	}

}
