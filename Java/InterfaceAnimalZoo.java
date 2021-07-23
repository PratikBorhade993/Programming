//Interface real time scenarios:Animal with its food type must be in same zoo
class Zoo
{
	void insert_animal(Animal a)
	{
		System.out.println("Animal Inserted In Zoo is:"+a);
		a.food();
	}
}
interface Animal
{
	void food();
}
class Deer implements Animal
{
	public void food()
	{
		System.out.println("Herbivorous Animal");
	}
}
class Dog implements Animal
{
	public void food()
	{
		System.out.println("Omnivorous Animal");
	}
}

class Tiger implements Animal
{
	public void food()
	{
		System.out.println("Carnivorous Animal");
	}
}
class Animal_user
{
	public static void main(String args[])
	{
		Zoo national_zoo=new Zoo();
		
		national_zoo.insert_animal(new Tiger());
		
		national_zoo.insert_animal(new Deer());
		national_zoo.insert_animal(new Dog());
	}
}