//Overiding in java
class Parent
{
void property()
{
System.out.println("parent=Investment");
}
void car()
{
System.out.println("Parent:Swift");
} 
}
class Child extends Parent
{
void car()
{
System.out.println("Child:Brizza");
}
public static void main(String args[])
{
Parent p=new Parent();
p.car();
Child c=new Child();
c.car();
Parent p1=new Child();
p1.car();
} 
}