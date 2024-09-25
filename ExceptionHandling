import java.util.*;
public class AritmeticException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String choice="y";
		do {
		System.out.println("Enter the Option");
		System.out.println("1 Aritmetic Exception");
		System.out.println("2 Array Index Out Of Bounds Exception");
		int option= sc.nextInt(); 
		switch(option){
			
		case 1:{
		System.out.println("Enter Number 1");
		int num1=sc.nextInt();
		System.out.println("Enter the Number2");
		int num2=sc.nextInt();
		try {
			int div =num1/num2;
			System.out.println("Result ="+div);
			System.out.println("End of try block");
			
		}catch(ArithmeticException e) {
			System.out.println("Exception is "+e);
		}finally {
			System.out.println("\n Finally block content");
			System.out.println("\n My code is safe from exception");
		}
		}
		break;
		case 2:{
		//System.out.println("");
		System.out.println("Ente the number of elements you want to store");
		int n= sc.nextInt();
		int[] Arr=new int[n];
		int len = 0;
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			Arr[i]=sc.nextInt();
		}
		System.out.println("Array length: "+ Arr.length);
		System.out.println("The array elemets are:");
		for(int i=0;i<n;i++) {
			System.out.println(Arr[i]+ "  ");
		}
		System.out.println("Enete the postion of the element to be accesse");
		int pos = sc.nextInt();
		try {
			System.out.println("Element at the postion"+ pos +" "+Arr[pos]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception is "+e);
		}finally {
			System.out.println("\n Finally block content");
			System.out.println("\n My code is safe from exception");
		}
		}
		break;
		
		default:
			System.out.println("Invaid......!!!");
		
			break;
			
		}
		System.out.println(" Do you want to continue(Y/N)");
		choice= sc.next();
		}while(choice.toLowerCase().equals("y"));
		System.out.println("Exting..................");
		

}
	
}
