  package corejava;
class A1
{
	A1()
	{
		System.out.println("A1 default constructor");
	}
	void show()
	{
		System.out.println("show from A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1 default constructor");
	}
	void show()
	{
		super.show();
		System.out.println("show from B1");
	}
	class C1 extends B1
	{
		C1()
		{
			System.out.println("C1 default constructor");
		}
		void show()
		{
			super.show();
			System.out.println("show from C1");
		}

public class constructorchainning {
public void main(String[] args) {
	B1 c=new B1();
	c.show();
}
}
	}
}



	

