package Package1;

import java.util.Scanner;

public class Offseason {
 double disc;
	int price;


public void discount() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter price of item");
	int price = s.nextInt();
	
	disc = (price * 15)/100;
	
	System.out.println("Discount amount in OffSeason is " +disc);
	
	
}

}
