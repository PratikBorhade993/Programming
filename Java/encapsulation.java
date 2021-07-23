
class Student
{
	private int rollno;
	private int marks;
	public float getRollno()
	{
		return rollno;
		
	}
	public float getMarks()
	{
		
		return marks;
		
	}
	public void setRollno(int x)
	{
		this.rollno=x;
		
	}
	public void setMarks(int y)
	{
		this.marks=y;
		
	}
	
}
class pratik
{
	
	
	public static void main(String args[])
	{
	Student x=new Student();
	x.setMarks(20);
	x.setRollno(10);
	float p =x.getMarks();
	float q =x.getRollno();
		System.out.println(p);
		
		System.out.println(q);
		
	}
	
}	