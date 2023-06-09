package OOPS2;

public class ChildExample extends ParentExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildExample ce=new ChildExample();
		ce.ChildMethod();
		ce.ParentMethod();
		ce.test("Selenium");
		
		//ParentExample pe=new ParentExample();
		//pe.ParentMethod();
		
	}
	public void ChildMethod() {
		System.out.println("Child class Method");
	}
	
	public void test(String st) {
		System.out.println("Test method from Child "+st);
	}

}
