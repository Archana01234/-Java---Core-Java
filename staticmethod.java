package corejava;

public class staticmethod {
	static int a=10;
	static int b;
	public staticmethod() {
		System.out.println("Hello");
	}
	static void meth(int X)
	{
		System.out.println("X :"+X);
		System.out.println("A :"+a);
		System.out.println("b :"+b);
	}
	{
		System.out.println("block 1");
	}
	static 
	{
		System.out.println("static block initialized");
		b=a*4;
	}
	{
		System.out.println("block 2");
	}

	public static void main(String[] args) {
		meth(12);
		staticmethod s=new staticmethod();
	}

}
