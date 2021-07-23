//Abstrction Syntactical Review
//Concrete class and concrete method
class Demo5  //Concrete class
{
	static int a=fun();
	int b;
	void gun() //Concrete method
	{
		System.out.println("In concrete class non-static function(Concrete method)");
		System.out.println("b="+20);
	}
	Demo5()
	{
		System.out.println("In concrete Class Default Constructor");
	}
	static int fun()
	{
		System.out.println("In Concrete Class Static Function");
		return 10;
	}
	{
		
		System.out.println("In concrete class non-static Block");
	}
	static
	{
		
		System.out.println("In concrete class static Block");
		
		System.out.println("a="+a);
	}
};