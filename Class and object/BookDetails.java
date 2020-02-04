// WAP to design a class Book and declare its common properties and display the 4 books details?
class Book 
{
	int bookId;
	String bookName;
	double price;
	Book(int id,String name,double mrp)
	{
		bookId=id;
		bookName=name;
		price=mrp;
	}
	void display()
	{
		System.out.println("____________BOOKS DETAILS____________");
		System.out.println("book Id :-"+bookId+"\nbook Name :-"+bookName+"\nPrice :-"+price);
	}
}
class BookDetails
{
	public static void main(String args[])
	{
		Book b1=new Book(1002,"Chemistry",500);
		b1.display();
		
		Book b2=new Book(1023,"Physical",600);
		b2.display();
		
		Book b3=new Book(1834,"Mathematical",460);
		b3.display();
		
		Book b4=new Book(1854,"History",750);
		b4.display();
	}
}