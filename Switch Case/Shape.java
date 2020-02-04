//write a program to calculate the different shape

class Shape
{
	public static void main(String args[])
	{
		int breath=6,radius=5,length=5,height=5,base=6;
		double area=0,pi=3.14;
		String sha= "circle" ;
		switch(sha)
		{
			case "circle":
				area=pi*radius*radius;
				System.out.println("Area of circle = "+area);
			break;
			case "rectangle":
				area=length*breath;
				System.out.println("Area of rectangle = "+area);
			break;
			case "triangle":
				area=(height*breath)/2;
				System.out.println("Area of triangle = "+area);
			break;
			default:
				System.out.println("Error");
		}
	}
}			
						  