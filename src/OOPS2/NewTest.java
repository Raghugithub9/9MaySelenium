package OOPS2;

public class NewTest extends TestBank {

	public static void main(String[] args) {
		
		NewTest nt=new NewTest();
		nt.credit();
		nt.savings();
		nt.debit();
		
	}

	@Override
	public void credit() {
		System.out.println("Credit");
		
	}

}
