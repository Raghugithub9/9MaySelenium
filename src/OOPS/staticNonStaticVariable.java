package OOPS;

public class staticNonStaticVariable {

	public static void main(String[] args) {
		
	//static functions	
		add();
		add();
		add();
		add();
		staticNonStaticVariable.add();
		
	//Non static
	//sub(); can't be called
	//staticNonStaticVariable.sub();can't be called
		
		staticNonStaticVariable ns1=new staticNonStaticVariable();
		staticNonStaticVariable ns2=new staticNonStaticVariable();
		staticNonStaticVariable ns3=new staticNonStaticVariable();
		staticNonStaticVariable ns4=new staticNonStaticVariable();
		staticNonStaticVariable ns5=new staticNonStaticVariable();

		//new staticNonStaticVariable() - Object
		//ns - object reference
		
		ns1.sub();
		ns2.div();
		ns3.sub();
		
		new staticNonStaticVariable().sub();
		new staticNonStaticVariable().sub();
	}
	
	public static void add() {
		System.out.println("add");
	}
	
	public void sub() {
		System.out.println("sub");
	}
	public void div() {
		System.out.println("sub");
	}

}
