package OOPS2;

public class RaghuBank implements Bank {

	public static void main(String[] args) {
		
		RaghuBank rb=new RaghuBank();
		rb.savings();
		rb.debit();
		rb.credit();
		rb.loans();
		
		Bank rb1=new RaghuBank();
		rb1.savings();
		rb1.credit();
		rb1.debit();
		//rb1.loans();

	}

	
	public void savings() {
	System.out.println("Savings");
		
	}

	
	public void debit() {
		System.out.println("debit");
		
	}


	public void credit() {
		System.out.println("credit");
		
	}

	public void loans() {
		System.out.println("Loans");
	}

}
