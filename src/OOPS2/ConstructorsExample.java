package OOPS2;

public class ConstructorsExample {

//Constructor Overloading
public 	ConstructorsExample() {
	System.out.println("Constructor Example");
}
public 	ConstructorsExample(String st) {
	System.out.println("Constructor Example "+st);
}
	
	public static void main(String[] args) {
		
		ConstructorsExample ce=new ConstructorsExample();
		ConstructorsExample ce1=new ConstructorsExample("Selenium");
		

	}

	
	public void add() {
		System.out.println("add");
	}
}
