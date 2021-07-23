class Demo
{
	static int a=fun();
	static
	{
		System.out.println("This is static block1");
	}
	public static void main(String args[])
	{
		System.out.println(a);
		System.out.println("this is main method of demo");
		//Test T=new Test();
	}
	static
	{
		System.out.println("This is static block2");
	}
	static int fun()
	{
	  System.out.println("This is static method of Demo");
       return 10;	
	}
	
	
}