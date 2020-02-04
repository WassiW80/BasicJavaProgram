
import java.util.Scanner;

class Addition{
	
	public void add(int a,int b) {
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("Super"+(a+b));

	}
}
class Addition1 extends Addition{
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		super.add(a, b);
		System.out.println("Derieved"+(a+b));
	}
}
class Test {
	public static void main(String[] args) {
		Addition1 addition1=new Addition1();
		int a=10;
		int b=20;
		addition1.add(a, b);
	}
}