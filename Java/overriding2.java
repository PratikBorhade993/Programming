//Overiding 2:
class Parent
{
int a=10;
int b=20;
void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class Child extends Parent
{
int a=30;
int b=40;
void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
public static void main(String args[])
{
Parent p=new Parent();
p.display();
Child c=new Child();
c.display();
Parent p1=new Child();
p1.display();
}
}