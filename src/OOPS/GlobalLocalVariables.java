package OOPS;

public class GlobalLocalVariables {

	//global variable
	static int a=100;
	int c=100;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		//System.out.println(b); local variable can't be used out of method
		add();
		
	}
	
	
	public static void add() {
		System.out.println("Add");
		//local variable
		int b=200;
		System.out.println(b);
	}
	
	

}
