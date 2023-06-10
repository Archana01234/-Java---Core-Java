package corejava;

public class methodoverloading {
	
	void test()
	{
		System.out.println("test with no argument");
	}
	void test(int a)
	{
		System.out.println("test with 1 argument");
	}
	void test(int a , float b)
	{
		System.out.println("test with 2 argument");

	}
	public static void main(String[] args) {
		methodoverloading m=new methodoverloading();
		m.test();
		m.test(10);
		m.test(10,10.10F);
	}

}
