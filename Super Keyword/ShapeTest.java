//import java.math.*;
class Shape
{
	double x1,x2,x3,y1,y2,y3,x4,y4,area;
	Shape()
	{
		this(15,15,23,30,50,25,42,10);
	}
	Shape(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.x3=x3;
		this.y3=y3;
		this.x4=x4;
		this.y4=y4;
	}
	void displayCircle()
	{
		System.out.println("\nGiven Points of Circle :-");
		System.out.println("Point A("+x1+","+y1+")");
		System.out.println("Point B("+x2+","+y2+")");
	}
	void displayTriangle()
	{
		System.out.println("\nGiven Point of Triangle :-");
		System.out.println("Point A("+x1+","+y1+")");
		System.out.println("Point B("+x2+","+y2+")");
		System.out.println("Point C("+x3+","+y3+")");		
	}
	void displayRectangle()
	{
		System.out.println("\nGiven Point of Rectangle :-");
		System.out.println("Point A("+x1+","+y1+")");
		System.out.println("Point B("+x2+","+y2+")");
		System.out.println("Point C("+x3+","+y3+")");
		System.out.println("Point D("+x4+","+y4+")");
	}
	
}
class Triangle extends Shape
{
	void areaOfTriangle()
	{
		super.displayTriangle();
		area =Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);
		
		System.out.println("Area:- "+area);
	}
}
class Rectangle extends Shape
{
	void areaOfRectangle()
	{
		super.displayRectangle();
		double height=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double width=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		area=Math.abs(height*width);
		System.out.println("Area of Rectangle:- "+area);
	}
}

class Circle extends Shape
{
	void areaOfCircle()
	{
		super.displayCircle();
		double pi=3.14;
		double r=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		area=pi*r*r;
		System.out.println("Area:- "+area);
	}
}
class ShapeTest
{
	public static void main(String args[])
	{
		Triangle sh=new Triangle();
		sh.areaOfTriangle();
		Circle cr=new Circle();
		cr.areaOfCircle();
		Rectangle rt=new Rectangle();
		rt.areaOfRectangle();
	}
}
	