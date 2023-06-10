package corejava;

interface ifs1
{
	void meth2();
}
interface ifs2 extends ifs1

{
	void meth2();
}

 public class interfacedemo implements ifs1,ifs2{
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
		
	}
	public static void main(String[] args) {
		interfacedemo interfacedemo=new interfacedemo();
		interfacedemo.meth2();

	}

}
