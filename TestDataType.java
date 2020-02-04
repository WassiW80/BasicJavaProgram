//class test data type take a method display

class TestDataType
{
	static byte a;
	static short b;
	static int c=10;
	static int c1;
	static long d;
	static float e=2.14f;
	static double f;
	static double f1;
	static char g=(char)c;
	static boolean h;
	static void testData()
	{
		a=10;
		b=a;
		c=b;
		d=c;
		e=d;
		f=e;
		c1=g;
		f1=e;
	}
	static void display()
	{
		//testData();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("E="+e);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(c1);
		System.out.println("G="+g);
		System.out.println(h);
	}
	public static void main(String args[])
	{
		display();
	}
}