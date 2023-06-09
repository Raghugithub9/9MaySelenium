package Basics;

import OOPS2.ChildExample;

public class Arrays {

	public static void main(String[] args) {
		
		//One Dimension and Two Dimensional
		
		int a[]=new int[3];
		
		ChildExample ce=new ChildExample();
		ce.ParentMethod();
		ce.ChildMethod();
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		
		System.out.println(a[1]);
		
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}

	}

}
