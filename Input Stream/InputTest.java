class InputTest 
{
	double areaOfCircle(double rad)
	{
		return rad*rad*3.14;
	}
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a radius");
		int rad=sc.nextInt();
		InputTest it =new InputTest();
		double result=it.areaOfCircle(rad);
		System.out.println("Area of circle is :-"+result);
		
		System.out.println("Enter 2 radius");
		System.out.println("Area of circle is:-"+new InputTest().areaOfCircle(sc.nextInt()));
	}
}