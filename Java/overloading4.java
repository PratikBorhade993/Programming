//Overloading 4:
class Demo
{
public static void m1(int a,float b)
{
System.out.println("Parent Method");
}
}
class Test extends Demo
{
public static void m1(int a,long b)
{
System.out.println("Child Method");
}
public static void main(String args[])
{
Test t=new Test();
t.m1(10,10);
t.m1(10,10.5f);
}
}