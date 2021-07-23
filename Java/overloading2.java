//Overloading 2:
class Demo
{
void m1(int a,double d)
{
System.out.println("method 1");
}
void m1(int a,float f)
{
System.out.println("method 2");
}
public static void main(String args[])
{
Demo d=new Demo();
d.m1(10,10.3f);
}
}
