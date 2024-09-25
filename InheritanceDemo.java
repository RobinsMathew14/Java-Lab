package lab1;

import java.util.Scanner;

class Employee

{

	int age;

	long phonenum;

	String name,address;

	

	int salary;

	void print_salary() {

		System.out.println("Salary="+salary);

	}

	void print_Employee()

	{

		System.out.println("Name:"+name);

		

		System.out.println("Age:"+age);

		

		System.out.println(" Phonenumber:"+phonenum);

		

		System.out.println("Address"+address);

	}

}



class Officer extends Employee

{

	String Spec;

	void print_spec() {

		System.out.println("Specialisation:"+Spec);

	}

	

}

class Manager extends Employee

{

	

	 

	public String department;



	void print_dep()

	{

		

		System.out.println ("Departmnet:"+department);

		

	}

	

}



public class InheritanceDemo1 {



	public static void main(String[] args) {

		Manager obj=new Manager();

		Officer obj1=new Officer();

		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter the Managaer name:");

		obj.name=sc.nextLine();

		System.out.println("\nEnter the Manager age:");

		obj.age=sc.nextInt();

		sc.nextLine();

		System.out.println("\nenter the Manager address:");

		obj.address=sc.nextLine();

		

		System.out.println("\nenterthe Manager phonenumber:");

		obj.phonenum=sc.nextLong();

		sc.nextLine();

		System.out.println("\nEntwr the manager department:");

		obj.department=sc.nextLine();

		

		System.out.println("\nenter the salary:");

		obj.salary=sc.nextInt();

		

		

		System.out.println("\nEnter the Officer name:");

		obj1.name=sc.nextLine();

		sc.nextLine();

		System.out.println("\nEnter the Officer age:");

		obj1.age=sc.nextInt();

		sc.nextLine();

		System.out.println("\nenter the Officer address:");

		obj1.address=sc.nextLine();

		sc.nextLine();

		System.out.println("\nenterthe Officer phonenumber:");

		obj1.phonenum=sc.nextLong();

		

		System.out.println("\nenter the salary:");

		obj1.salary=sc.nextInt();

		sc.nextLine();

		System.out.println("\nenterthe officer specialisation:");

		obj1.Spec=sc.nextLine();

		

		System.out.println("MANAGER DETAILS\n");

		obj.print_Employee();

		obj.print_salary();

		obj.print_dep();

		

		System.out.println("\nOFFICER DETAILS\n");

		obj1.print_Employee();

		obj1.print_salary();

		obj1.print_spec();



		

		



	}



}
