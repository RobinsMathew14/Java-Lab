package oobj24cseb63;
import java.util.*;
public class FrequencyOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next().toLowerCase();
		System.out.println("Enter the character to search: ");
		char checkChar=sc.next().toLowerCase().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if (checkChar==str.charAt(i)) {
			count++;
		}
		}
System.out.println("The character '"+checkChar+"' was repeated "+count+" times");
	}}
