package oobj24cseb62;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.io.IOException;
public class Demo1 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String content = sc.nextLine();
		try {
			
			
			File obj1 = new File("sample.txt");
			obj1.createNewFile();
			
			FileWriter fr = new FileWriter("sample.txt");
			fr.write(content);
			fr.close();
			System.out.println("Content written to " +obj1.getName());
			System.out.println("----Contents of sample.txt----\n " +content);
			
			File obj2 = new File("newsample.txt");
			obj2.createNewFile();
			
			FileInputStream fis = new FileInputStream("sample.txt");
			FileOutputStream fos = new FileOutputStream("newsample.txt");
			int c;
			while((c = fis.read())!= -1) {
				fos.write(c);
			}
			System.out.println("Content is copied from sample.txt to newsample.txt");
			System.out.println("----Contents of newsample.txt----\n " +content);
			fis.close();
			fos.close();
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
sc.close();
	}

}
