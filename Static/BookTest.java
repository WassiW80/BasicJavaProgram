class Book
{
	String bname;
	static double bprice;
	
	Book(){}
	
	Book(String bname,double bprice)
	{
		this.bname=bname;
		this.bprice=bprice;
	}
	
	void displayBook()
	{
		System.out.println("Book Name:-"+bname);
		System.out.println("Book Price:-"+bprice);
	}
}

class BookTest
{
	public static void main(String args[])
	{
		Book j2se,j2ee;
		j2se=new Book("JAVA",400);
		j2ee=new Book("Web Design",500);
		
		j2se.displayBook();
		j2ee.displayBook();
	}
}