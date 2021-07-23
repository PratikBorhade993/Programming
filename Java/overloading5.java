//Overloading 5:
class Demo
{
void m1(Integer I)
{
System.out.println("Integer m1 method");
}
void m1(float f)
{
System.out.println("Float m1 method");
}
public static void main(String args[])
{
Demo d=new Demo();
d.m1(10);
}
}