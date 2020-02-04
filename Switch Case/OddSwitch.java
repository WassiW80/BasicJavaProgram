//write a program for even and odd using switch case

class EvenSwitch
{
	public static void main(String args[])
	{
		int num=4;
		String Alpha="Odd";
		switch(Alpha)
		{
			case "Even":
				if(num%2==0)
				{
					System.out.println("number is Even "+num);
				}
				else
				{
					System.out.println("number is not Even "+num);
				}
			break;
			case "Odd":
				if(num%2!=0)
				{
					System.out.println("number is Odd "+num);
				}
				else
				{
					System.out.println("number is not Odd "+num);
				}
			break;
			default:
				System.out.println("number is neither even nor odd");
		}
	}
}