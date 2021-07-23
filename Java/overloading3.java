//Overloading 3:
class Demo
{
static void m1(int a,int b)
{
System.out.println("first method");
}
static void m1(int a,float b)
{
System.out.println("Second method");
}
public static void main(String args[])
{
Demo d=new Demo();
d.m1(10,20);
d.m1(30,10.7f);
}
}