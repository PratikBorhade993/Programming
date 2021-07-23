class Person
{
	public
	   String name;
	   String address;
	   String mobileno;
	   int age;
	   static int hands=hands();
	 static int hands()
	 {
		 System.out.println("Person static function");
		 return 2;
	 }
	 static
	 {
		 System.out.println("Person static block");
	 }
	 {
		 System.out.println("Person non-static block");
	 }
	public static void main(String args[])
	{
		Person p=new Person();
	}
}
class Student extends Person
{
	int rollno;
	float marks;
	static String collegename=college();
	Student(int rollno,float marks)
	{
		this.rollno=rollno;
		this.marks=marks;
	}
	static String college()
	{
		System.out.println("student static function");
		return "AVCOE";
	}
	static
	{
		System.out.println("Student Static block");
	}
	{
		System.out.println("Student non-static block");
	}
	public static void main(String args[])
	{  
		Student ram=new Student(1,60);
	}
}