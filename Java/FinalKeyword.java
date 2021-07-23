//FINAL CLASS*
/*final class FinalClass
{
void fun()
{
System.out.println("Fun Parent");
}
}
class FinalClass1 extends FinalClass
{
void fun()
{
System.out.println("Fun Child");
}
public static void main(String args[])
{
FinalClass1 fc=new FinalClass1();
fc.fun();
}
}*/
//*FINAL FIELD*
class FinalField
{
final int a;
FinalField()
{
this.a=a;
System.out.println("a="+a);
}
public static void main(String args[])
{
FinalField ff=new FinalField();
}
}
//*FINAL LOCAL VARIABLE*
class FinalLocal
{
public static void main(String args[])
{
final int a;
//System.out.println("a="+a);
}
}
//*FINAL METHOD*
/*class FinalMethod
{
final void fun()
{
System.out.println("Fun Function of parent");
}
}
class FinalMethod1 extends FinalMethod
{
void fun()
{
System.out.println("Fun Function of child");
}
public static void main(String args[])
{
FinalMethod1 fm=new FinalMethod1();
fm.fun();
}
}*/