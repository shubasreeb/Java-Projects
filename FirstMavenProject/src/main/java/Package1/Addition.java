package Package1;

import java.util.Scanner;

public class Addition {

	int a, b, total;
	


public void add() {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two numbers to check its sum divisible by 10 ");
	a = s.nextInt();
	b = s.nextInt();
	
	total = a + b;
	
	System.out.println("Sum = " +total);
}
}

