package AccessModifiers;

public class PrivateExample {

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
		pe.print();

	}

private void print() {
	System.out.println("Print from Private Class");
}
	
}
