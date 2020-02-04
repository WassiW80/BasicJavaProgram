class Animal
{
	String name;
	String type;
	double price;
	Animal()
	{
		name="Cat";
		type="Canivorous";
		price=10000;
	}
	Animal(String n,String t,double p)
	{
		name=n;
		type=t;
		price=p;
	}
	void display(Animal animal)
	{
		System.out.println("____________Animal Details____________");
		System.out.println("Name:- "+name+"\nType:- "+type+"\nPrice:- "+price);
	}
}
class AnimalTest
{
	public static void main(String args[])
	{
		Animal a1=new Animal();
		a1.display(a1);
		
		Animal a2=new Animal("Dog","Canivorous",50000);
		a2.display(20);
		
		Animal a3=new Animal("Cow","Harbivorous",10000);
		a3.display(30);
	}
}