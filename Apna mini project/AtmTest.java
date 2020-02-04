import java.util.*;
class Atm
{
	String name;
	int age;
	long accNo;
	double bal;
	Atm(){}
	
	Atm(String name,int age,long accNo,double bal)
	{
		this.name=name;
		this.age=age;
		this.accNo=accNo;
		this.bal=bal;
	}
	
	//Deposit Fucntion
	void deposit(int dep)
	{
		bal=bal+dep;
		System.out.println(dep+" is credited to your account \n And your total balance is :-"+bal);
	}
	
	//Withdraw Function
	void withdraw(int wit)
	{
		if(wit>bal)
		{
			System.out.println("Insufficient balance!");
			System.out.println("Your current balance is "+bal);
		}
		else
		{
			bal=bal-wit;
			System.out.println(wit+" is debited from your account \n And your total balance is :-"+bal);
		}
	}
	
	//Check Balance
	void checkBalance()
	{
		System.out.println("Your account is :- "+bal);
	}
	
	//display all details 
	void details()
	{
		System.out.println("Account number :- "+accNo+"\nName :- "+name+"\nAge:- "+age);
	}
	
}
class AtmTest
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Atm at=new Atm();
		int bal=0;
		String cont;

		do 
		{
			System.out.println("Enter your choice \nPress 1: for Create new account\nPress 2: for Deposit money\nPress 3: for Withdraw money\nPress 4: To check balance\nPress 5: To display account details");
			int choice=scan.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.println("Enter your name :");
					String name=scan.next();
					System.out.println("Enter your age :");
					int age=scan.nextInt();
					System.out.println("Enter your Account :");
					int accNo=scan.nextInt();
					at=new Atm(name,age,accNo,bal);
				break;
				case 2:
					System.out.println("Enter amount to deposit");
					int dep=scan.nextInt();
					at.deposit(dep);
				break;
				case 3:
					System.out.println("Enter amount to withdraw");
					int wit=scan.nextInt();
					at.withdraw(wit);
				break;
				case 4:
					at.checkBalance();
				break;
				case 5:
					at.details();
					break;
				default:
					System.out.println("Enter the number from given option only");
			}
			System.out.println("\nDo you want to continue the transaction (Y/N)");
			cont=scan.next();
		}while(cont.equals("Y") || cont.equals("y"));
	}
}
