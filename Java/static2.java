
class Demo1
{
static int b=fun1();
	static
	{
		System.out.println("This is static block3");
	}
	public static void main(String args[])
	{
		System.out.println(b);
		System.out.println("this is main method of Demo1");
	}
	static
	{
		System.out.println("This is static block4");
	}
	static int fun1()
	{
		Demo.fun();
	  System.out.println("This is static method of Demo1");
       return 20;	
	}
}