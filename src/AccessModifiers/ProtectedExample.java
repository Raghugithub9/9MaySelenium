package AccessModifiers;

public class ProtectedExample {

	public static void main(String[] args) {
		
		ProtectedExample pro=new ProtectedExample();
		pro.add();
	}

	protected void add() {
		System.out.println("add from Protected");
	}
	
}
