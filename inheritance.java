package corejava;

import java.util.Scanner;

class A{
	int a;
	Scanner scanner=new Scanner(System.in);
	void getA() {
		System.out.println("Enter A :");
		a=scanner.nextInt();
		
	}
	void putA() {
		System.out.println("A:"+a);
	
	}
}
class B extends A
{
	int b;
	Scanner scanner=new Scanner(System.in);
	void getB() {
		System.out.println("Enter B :");
		b=scanner.nextInt();
		
	}
	void putB() {
		System.out.println("B:"+b);
	
	}
	class C extends A
	{
		int C;
		Scanner sc=new Scanner(System.in);
		void getC() {
		}
		{
			System.out.println("Enter C:");
			C=sc.nextInt();
		}
		void putC()
		{
			System.out.println("C "+C);
	
		}
}

public static class inheritance {
	public static void main(String[] args) {
		
	
		B b1=new B();
		b1.getA();
		b1.getB();
 		b1.putA();
		b1.putB();
	}
}

}


		

	




		
	
		
	

