import java.util.*;

class Product
{
	double price;
	String name;
	int id;
	Product()
	{
		this(12,"Watch",250);
	}
	Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println("Product Id:-"+id+"\nProduct Name:-"+name+"\nPrice:-"+price);
	}
}

class Order extends Product
{
	void discount(int discountAmount)
	{
		double dis=(price*discountAmount)/100;
		price=price-dis;
	}
}

class ProductTest
{
	public static void main(String args[])
	{
		Order or=new Order();
		or.discount(10);
		or.display();
	}
}