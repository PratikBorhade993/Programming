 class Parent
{
	int x;
	Parent()
	{
		System.out.println("In Parent Default Constructor");
	}
	Parent(int a)
	{
		System.out.println("In Parent Parameterized Constructor");
		System.out.println(a);
	}
	public static void main(String args[])
	{
		Parent P=new Parent();
		System.out.println("In Parent Main Function");
	}
	
}
 class Child extends Parent
{
	int y;
	Child()
	{
		this(30);
		this.y=20;
		System.out.println("In Child Default Constructor");
		System.out.println(this.y);
	}
	Child(int b)
	{
		super(40);
		System.out.println("In Child Paremeterized Constructor");
		System.out.println(b);
	}
	public static void main(String args[])
	{
		Child c=new Child();
		System.out.println("In Child Main Function");
	}
}