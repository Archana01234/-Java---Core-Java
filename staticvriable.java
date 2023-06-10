package corejava;

import java.util.Scanner;

public class staticvriable {
	int a;
	void setvalue() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A");
		a=sc.nextInt();
	}
	void putvalue()
	{
		System.out.println("a :"+a);
	}
	public static void main(String[] args) {
		staticvriable s1=new staticvriable();
		staticvriable s2=new staticvriable();
		staticvriable s3=new staticvriable();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.putvalue();
		s2.putvalue();
		s3.putvalue();
	}
		
	}
	
	
	
	


