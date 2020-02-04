class Table
{
	int row,column;
	Table(int r,int c)
	{
		row=r;
		column=c;
	}
	void displayTable()
	{
		System.out.println("Row:- "+row+" Column:- "+column);
	}
}
class TableTest
{
	public static void main(String args[])
	{
		Table t[];
		t=new Table[100];
		for(int i=0;i<100;i++)
			t[i]=new Table(2,3);
		for(int i=0;i<100;i++)
			t[i].displayTable();
	}
}