//2. WAP to take radius value from cmd and calculate the area of circle by using function?

class Area
{
	static double areaOfCircle(double radius)
	{
		double area=0;
		final double pi=3.14;
		area=pi*radius*radius;
		return area;
	}	
	public static void main(String args[])
	{
		System.out.println(areaOfCircle(Double.parseDouble(args[0])));
	}
}