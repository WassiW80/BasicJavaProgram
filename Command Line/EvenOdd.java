/*1. WAP to take an input from cmd and check whether it is even or odd by using function?*/

class EvenOdd
{
	static void checkEven(int i)
	{
		
		if(i%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	public static void main(String args[])
	{
		checkEven(Integer.parseInt(args[0]));
	}
} 				
		