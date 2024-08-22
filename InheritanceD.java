import java.util.*;
class Employeee{
	int ba;
	int hra,da;
	Employeee(int ba,int da,int hra){
		this.ba=ba;
		this.da=da;
		this.hra=hra;
	}
		void display() {
			System.out.println("....Employee....");
		}
	

	void calcsalary() {
		System.out.println("The Gross Salary of the empolyee :"+(ba+(ba*da)/100+(ba*hra)/100));
	}
}
class Engineer extends Employeee{
	Engineer(int ba, int da, int hra) {
		super(ba, da, hra);
		// TODO Auto-generated constructor stub
	
	}
void display() {
	super.display();
	super.calcsalary();
	System.out.println("....Engnieer....");
	
}

	void calSalary() {
		System.out.println("The Gross Salary of the Engineer is :"+(2*(ba+(ba*da)/100+(ba*hra)/100)));
	}
}
public class InheritanceD {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the basic salary of the employee: ");
		int ba=sc.nextInt();
		System.out.println("\n Enter the DA of the employee: ");
		int da=sc.nextInt();
		System.out.println("\n Enter the HRA of the employee: ");
		 int hra=sc.nextInt();
		Engineer Eng=new Engineer(ba, da, hra);
		
		Eng.display();
		Eng.calSalary();
		
	}
	
	
}
