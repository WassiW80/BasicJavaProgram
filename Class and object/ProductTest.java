class Product
{
	int pid;
	String pname;
	void display()
	{
		System.out.print(pid+" ");
		System.out.println(pname);
	}
}
class ProductTest
{
	public static void main(String args[])
	{
		Product pen=new Product();
		pen.pid=1001;
		pen.pname="Parker";
		pen.display();
		Product pencil=new Product();
		pencil.pid=1002;
		pencil.pname="Natraj";
		pencil.display();
	}
}