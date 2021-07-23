
class Test extends Demo
{
static int b=fun1();
	static
	{
		System.out.println("This is static block3");
	}
	public static void main(String args[])
	{
		System.out.println(b);
		Demo.main(args);
		System.out.println("this is main method of Test");
	}
	static
	{
		System.out.println("This is static block4");
	}
	static int fun1()
	{
	  System.out.println("This is static method of test");
       return 20;	
	}
}