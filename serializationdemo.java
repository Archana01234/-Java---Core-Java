package corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable
{
	int empno;
	String ename;
	double salary;
	public Emp(int empno, String ename, double salary) {
		
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
   
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

public class serializationdemo {
 public static void main(String[] args) throws IOException, ReflectiveOperationException {
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Emp e1=new Emp(1," archu", 10000);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		System.out.println("object wriiten successfully");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e2=(Emp) ois.readObject();
		ois.close();
		System.out.println(e2);
		
		
		
	}

}
 