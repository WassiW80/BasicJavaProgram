/*1: wap to create a business class "Product" and declare 3 variables as a class variable are  pid , pname and price and calculate the final price of product after deduction of 20% discount?*/

class Product
{
	static int pid=124;
	static double price=5240;
	static String pname="Wassi";
	static double calculatePrice(double discount)
	{		
		double finalPrice=0,discountAmount=0;
		discountAmount=(price*discount)/100;
		finalPrice=price-discountAmount;
		return finalPrice;
	}
}

class Driver
{
	public static void main(String args[])
	{
		System.out.println(Product.calculatePrice(20));
	}
}