package oobj24cseb63;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
	 String str=sc.nextLine().toLowerCase();
		int flag=0;
		int n=str.length();
		int i;
		for(i=0;i<n/2;i++) {
			if((str.charAt(i))!=(str.charAt(n-i-1))){
				flag=1;
				break;
			}
			}
if(flag==0) {
	System.out.println("The string: "+"'"+str+"'"+" "+"is a palindrome");
}else {
	System.out.println("The entered string is not a palindrome");
	}

}}
