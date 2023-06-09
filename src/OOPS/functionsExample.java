package OOPS;

public class functionsExample {

	public static void main(String[] args) {
		
		functionsExample fe=new functionsExample();
		fe.add();
		fe.add();
		fe.add();
		int ab=fe.add1();
		System.out.println("Value returned "+ab);
		
		int ab1=fe.sub(200, 100);
		System.out.println(ab1);
		int ab2=fe.sub(123, 15);
		System.out.println(ab2);
		int ab3=fe.sub(1234, 123);
		System.out.println(ab3);
	}

	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	//function with return type
	public int add1() {
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//function with parameters and returntype
	
	public int sub(int i, int j) {
		int k=i-j;
		
		return k;
	}
	
	
}
