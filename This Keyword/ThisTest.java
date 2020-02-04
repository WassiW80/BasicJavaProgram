class Business
{
	int x;
	Business()
	{
		this(100);
		System.out.println("DEFAULT:");
	}
	Business(int x)
	{
		this.x=x;
		this.display(400);
	}
	void display(int x)
	{
		System.out.println(this.x);
	}
}
class ThisTest
{
	public static void main(String args[])
	{
		Business b=new Business();
	}
}
