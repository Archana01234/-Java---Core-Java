package corejava;

import java.util.Scanner;

public class Abstraction {
public static void main(String[] args) {
	int x,y,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	x=sc.nextInt();
	
	System.out.println("Enter the seecond number");
	y=sc.nextInt();
	sum=sum(x,y);
	
	System.out.println("the sum of two number x and y :"+sum);}

public static int sum(int x, int y) {
	int sum =x+y;
	return sum;
}




}
