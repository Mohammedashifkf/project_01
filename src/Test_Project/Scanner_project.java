package Test_Project;


import java.util.Scanner;

public class Scanner_project {

	public static void main(String[] args) {
	Scanner ab=new Scanner (System.in);
	System.out.println("Enter ur first name");
	String name=ab.next();
	System.out.println("Enter ur Last name");
	String nm=ab.next();
	System.out.println(name.concat(nm));
	
	}

}

