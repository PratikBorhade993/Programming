
class Test extends Demo
{
	Test()
 {
	 System.out.println("This is constructor of Test");
 
	
 }
 int b=fun1();
 {
		System.out.println("This is non-static block1");
		System.out.println(b);
	}

 

	public static void main(String args[])
	{
		Test T=new Test();
		System.out.println(T.b);
		//Demo.main(args);
		System.out.println("this is main method of Test");
	}
	static
	{
		System.out.println("This is static block4");
	}
   int fun1()
	{
	  System.out.println("This is non-static method of test");
       return 20;	
	}
}