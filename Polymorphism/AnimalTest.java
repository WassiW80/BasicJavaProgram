class Animal
{
	void meow()
	{
		System.out.println("Anything...");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("meow...");
	}
}
class AnimalTest 
{
	public static void main(String args[])
	{
		Cat cat=new Cat();
		Animal animal=cat;	
		animal.meow();
		
		Cat cat2=(Cat)animal;
		cat2.meow();
		
		Cat cat3=(Cat)new Animal();
		cat3.meow();
	}
}		








