package Basics;

import AccessModifiers.ProtectedExample;

public class TestProtected extends ProtectedExample {

	public static void main(String[] args) {
		
		ProtectedExample pro=new ProtectedExample();
		//pro.add();
		TestProtected tp=new TestProtected();
		tp.add();
		
	}

}
