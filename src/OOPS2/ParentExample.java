package OOPS2;

public class ParentExample  {

	public static void main(String[] args) {

		ParentExample pe=new ParentExample();
		pe.ParentMethod();
		//pe.ChildMethod();
		
		//ChildExample ce=new ChildExample();
		//ce.ChildMethod();

	}

	public void ParentMethod() {
		System.out.println("Parent class Method");
	}
	
	public void test() {
		System.out.println("Test method from Parent");
	}
}
