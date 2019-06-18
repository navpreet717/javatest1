import java.util.Scanner;
public class BuyingPhones {
	

		public static void main(String[] args) {
			System.out.println("Enter the regular price of a phone: ");
			Scanner s = new Scanner(System.in);
			double price = s.nextDouble();
			int phones=3;
			System.out.println("price per phone: ");
			
			if(phones==3)
			{
				
				
			double	discount=50;
				double price2= (price * discount) / 100;
				System.out.println("Phone 1:"+" $"+price);
				System.out.println("Phone 2:"+" $"+price);
				System.out.println("Phone 3:"+" $"+price2);
				
				}

			

		}

	}


