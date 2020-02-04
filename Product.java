/*1: wap to create a business class "Product" and declare 3 variables as a class variable are  pid , pname and price and calculate the final price of product after deduction of 20% discount?*/

class Product
{
	int pid=124;
	double price=5240;
	String pname="Wassi";
	static double calculatePrice(double discount)
	{		
		price=(price*discount)/100;
		return price;
	}
}

class Driver
{
	public static void main(String args[])
	{
		double var=calculatePrice(20);
		System.out.println(var);
	}
}