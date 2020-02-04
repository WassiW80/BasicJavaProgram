class A
{
	int a=100;
	void display()
	{
		System.out.println("Super A:-"+a);
	}
}
class B extends A
{
	int a=200;
	void display()
	{
		System.out.println("Child B:-"+a);
	}
	void testDisplay()
	{
		display();
	}
}
class C extends B
{
	int a=300;
	void display()
	{
		System.out.println("Child C:-"+a);
	}
	void testDisplay()
	{
		super.display();
	}
}	
class BTest
{
	public static void main(String args[])
	{
		C b =new C();
		b.display();
		b.testDisplay();
	}
}
