//Write a program to calculate the BMI.

class BMI
{
	public static void main(String arg[])
	{
		double Weight=62.3,Height=1.727,bmi=0;
		bmi=Weight/(Height*Height);
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi>18.5 && bmi<24.9)
		{
			System.out.println("Normalweight");
		}
		else if(bmi>25 && bmi<29.9)
		{
			System.out.println("Overweight");
		}
		else
		{		
			System.out.println("Obesity");
		}
	}
}

