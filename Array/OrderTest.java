import java.util.*;
class Order
{
	int orderId;
	String productName;
	double price;
	Order orders[] = new Order[3];
	int count=0;
	
	Order()
	{
	}
	
	Order(int orderId,String productName,double price)
	{
		this.orderId=orderId;
		this.productName=productName;
		this.price=price;
	}
	void storeOrder(Order order)
	{
		if(count > orders.length)
		{
			System.out.println("Array is full!");
			
		}
		else
		{
			orders[count] =order; 
			System.out.println("Your order is Placed Successfully!");
		}
		count++;
	}
	void displayAllOrder()
	{
		for(Order order:orders)
			System.out.println(order.orderId+"\t"+order.productName+"\t"+order.price);
	}
	void searchOrder(int searchId)
	{
		for(Order order:orders)
		{
			if(searchId==order.orderId)
			{
				System.out.println(orderId+"\t"+productName+"\t"+price);
			}
			else
				System.out.println("Invalid Search");
		}
	}
}
class OrderTest
{
	public static void main(String args[])
	{
		//int choice=1;
		int a=0,i=0;
		String b=null;
		double d=0;
		String decision=null;
		Order order[];
		order=new Order[4];
		Scanner scan=new Scanner(System.in);
		int counter=0;
		do{
			System.out.println("Enter your choice:-");
			int choice=Integer.parseInt(scan.next());
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Order number");
					a=scan.nextInt();
					System.out.println("Enter the Order name");
					b=scan.next();
					System.out.println("Enter the Order price");
					d=scan.nextDouble();
					for(i=0;i<4;i++)
					{
						order[i]=new Order(a,b,d);
						order[i].storeOrder(order[i]);
					}
					break;
				case 2:
					System.out.println("Order Id\tProduct Name \tPrice");
					for(i=0;i<4;i++)
						order[i].displayAllOrder();
					break;
			
				case 3:
					System.out.println("Enter the order Id to search your order:-");
					int id=Integer.parseInt(scan.next());
					System.out.println("Order Id\tProduct Name \tPrice");
					for(i=0;i<2;i++)
						order[i].searchOrder(id);
					break;
				default:
					System.out.println("Invalid Option");
			}
				System.out.println("Do you want to continue!\nPress 'Y' for yes and 'N' for no");
				decision=scan.next();
		}while(decision.equals("y"));
	}
}