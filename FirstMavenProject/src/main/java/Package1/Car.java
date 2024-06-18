package Package1;

public class Car extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car(); // or Vehicle obj = new Car();
		
		 // Vehicle obj = new Car();  invokes binding method of parent class
		obj.binding();

	}
	
	public void binding() {
		
		System.out.println("Child class");
	}

}

