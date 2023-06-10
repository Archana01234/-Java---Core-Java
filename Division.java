package corejava;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("input the first number :");
		int a=input.nextInt();
		System.out.println("input the second number :");
		int b=input.nextInt();
		int d=a/b;
		System.out.println();
		System.out.println("the divistion of a and b is :"+d);
	
		
	}

}
