package AccessModifiers;

public class TestAcessModifiers {

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
	//	pe.print();
		
		defaultExample de=new defaultExample();
		de.Test();
		
		
		
		ProtectedExample pro=new ProtectedExample();
		pro.add();

	}

}
