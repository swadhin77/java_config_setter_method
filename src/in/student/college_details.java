package in.student;
public class college_details 
{
	private String name;
	private int rollno;
	private address add;
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setAdd(address add) {
		this.add = add;
	}
	public void display()
	{
		System.out.println("name is :"+name);
		System.out.println("roll no is :"+rollno);
		System.out.println("address is :"+add);
	}
}
