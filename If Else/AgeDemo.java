//Take input of age of 3 people by user and determine oldest and youngest among them.
class AgeDemo
{
	public static void main(String args[])
	{
		int Age1=20,Age2=20,Age3=30;
		if(Age1>Age2 && Age1>Age3)
		{
			System.out.println("Age1 is Greater");
		}
		else if(Age2>Age3 && Age2>Age1)
		{
			System.out.println("Age2 is Greater");
		}
		else
		{
			System.out.println("Age3 is Greater");
		}
	}
}