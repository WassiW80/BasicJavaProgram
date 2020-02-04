//WAP to design a class Transaction and perform the widraw and deposit operations for 2 users?
class Transaction
{
	double amount;
	double withdrawAmount(double widraw)
	{
		double total=amount-widraw;
		return total;
	}
	double depositAmount(double deposit)
	{
		double total=amount+deposit;
		return total;
	}
}
class TransactionTest
{
	public static void main(String args[])
	{
		Transaction t1=new Transaction();
		t1.amount=50000;
		System.out.println("Amount after withdraw:- "+t1.withdrawAmount(4000));
		System.out.println("Amount after deposit:- "+t1.depositAmount(5000));
		
		Transaction t2=new Transaction();
		t2.amount=80000;
		System.out.println("\nAmount after withdraw:- "+t2.withdrawAmount(4050));
		System.out.println("Amount after deposit:- "+t2.depositAmount(5500));
	}
}