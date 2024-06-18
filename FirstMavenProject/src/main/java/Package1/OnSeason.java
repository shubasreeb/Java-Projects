package Package1;
import java.util.Scanner;

public class OnSeason extends Offseason{
	
	
    static int price;
     double disc;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
       OnSeason os = new OnSeason();
       Offseason of = new Offseason(); 
   	Scanner s = new Scanner(System.in);
   	System.out.println("Enter price of item");
   	 price = s.nextInt();
       
       os.discount();
       of.discount();
       
	}
public void discount() {
	
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter price of item");
//	int price = s.nextInt();
	disc = (price * 40)/100;
	
	System.out.println("Discount amount in OnSeason is " +disc);
	
}
}
