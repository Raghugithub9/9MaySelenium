package OOPS2;

public class functionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	functionsExample fe=new functionsExample();
	
		fe.add("Selenium");
		fe.add("Java", 200);
	}

	//Method Overloading
	
	public void add(String t, int a) {
		System.out.println("add");
	}
	
	public void add(String st) {
		System.out.println("add");
	}
	
	
}
