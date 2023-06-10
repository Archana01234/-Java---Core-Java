package corejava;

import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A :");
		a=scanner.nextInt();
		System.out.println("Enter B :");
		b=scanner.nextInt();
		
		c=a/b;
		System.out.println("division"+c);
	
		
	}

}
