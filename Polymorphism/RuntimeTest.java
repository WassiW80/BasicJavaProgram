class RuntimeTest{
	public static void main(String args[])
	{
		A a1=new B();
		System.out.println(a1.getX());//100
		System.out.println(a1.x());//100
	}
}
class A
{
	int x=100;
	int getX()
	{
		return x;
	}
}
class B extends A
{
	int x=300;
	int getX()
	{
		return x;
	}
}
