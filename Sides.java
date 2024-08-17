package oobj24cseb63;
import java.util.*;
abstract class shape 
	{
		public abstract void nosides();
	}
 class Triangle extends shape
	{
		int side;
		Triangle(int side)
			{
				this.side=side;
			}
	
		public void nosides() 
		{
			System.out.println("I am a Triangle and I have "+side+ " Sides");
			
			int sum;
			sum=(side-2)*180;
			System.out.println("Sum of the angle :"+sum);
		}
	}
 class Rectangle extends shape
 	{
	 int side;
		Rectangle(int side)
			{
				this.side=side;
			}
	
		public void nosides() 
		{
			System.out.println("I am a Rectangle and I have "+side+ " Sides");
			
			int sum;
			sum=(side-2)*180;
			System.out.println("Sum of the angle :"+sum);
		}
 	}
 class Hexagon extends shape
	{
	 int side;
		Hexagon(int side)
			{
				this.side=side;
			}
	
		public void nosides() 
		{
			System.out.println("I am a hexagon and I have "+side+ " Sides");
			
			int sum;
			sum=(side-2)*180;
			System.out.println("Sum of the angle :"+sum);
		}
	}
public class Sides{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String option;
		do {
		System.out.println("Enter the number  of sides");
		int side;
		
	
		side=sc.nextInt();
		if(side==3) {
			Triangle tri=new Triangle(3);
			tri.nosides();
		}
		else if(side==4) {
			Rectangle Rec=new Rectangle(4);
			Rec.nosides();
		}
		else if(side==6) {
			Hexagon Hex=new Hexagon(6);
			Hex.nosides();
		}
		else {
			System.out.println("Invalid enter.......!!!!!!!!!!!!!!!!!");
		}
		sc.nextLine();
		System.out.println("Do you want to continue(Yes or No)");
		option=sc.next();
		 }while(option.toLowerCase().equals("yes"));
		
	}

}
