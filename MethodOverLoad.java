package oobj24cseb63;

import java.util.Scanner;

public class MethodOverLoad {

    public float Area(float base, float height) {
        return 0.5f * base * height;
    }

    public float Area(int length, int breadth) {
        return length * breadth;
    }

    public float Area(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodOverLoad obj = new MethodOverLoad();
    	System.out.println("Enter the base of the triangle");
		float trianglebase=sc.nextFloat();
		  System.out.println("Enter the height of the triangle :");
        float triangleheight = sc.nextFloat();
		System.out.println("Enter the breath of the rectangle");
		float lengthofrectangle=sc.nextInt();
		  System.out.println("Enter the height of the rectangle :");
        float breathofrectanle = sc.nextInt();
		System.out.println("Enter the radius");
		float radiusofcircle=sc.nextFloat();
		float triangle =obj.Area(trianglebase, triangleheight);
		System.out.println("Area of the triangle with base "+trianglebase+" and with heigth of "+triangleheight+" is "+triangle);
		float rectangle=obj.Area(lengthofrectangle,breathofrectanle);
		System.out.println("Area of the rectangle with length "+lengthofrectangle+" and with heigth of "+breathofrectanle+" is "+rectangle);
		float circle=obj.Area(radiusofcircle);
		System.out.println("Area of the circle "+radiusofcircle+" is "+circle);
		
		
	}


    }


