//Overloading 1:
class Demo
{
public void m1(int a,int b)
{
System.out.println("m1 method with int parameters");
}
public void m1(int a,float b)
{
System.out.println("m1 method with int ,float parameters");
}
public static void main(String args[])
{
Demo d=new Demo();
d.m1(10,20);
d.m1(10,10.5f);
}
}







