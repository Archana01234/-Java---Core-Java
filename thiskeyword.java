package corejava;
class student
{
	int rno;
	String name;
	public student() {
		System.out.println("default constructor");
	}
	public student (int rno,String sname) {
		this();
		System.out.println("paramiterized constructor called");
		this.rno=rno;
	}
	
	}


public class thiskeyword {
	public static void main(String[] args) {
		student s1=new student(1, "archana");
	}
}

	


