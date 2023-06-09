package Basics;

public class ConditionConcat {

	public static void main(String[] args) {
		
int a=1236;
int b=234;
String st="Java";

System.out.println(a+b);
System.out.println(st+a+b);
		
if(a>b) {
	System.out.println("a is greater "+a);
}else {
	System.out.println("b is greater "+b);
}

int c=2323123;

if(a>b && a>c) {
	System.out.println("a is greatest "+a);
}else if(b>c) {
	System.out.println("b is greatest "+b);
}else {
	System.out.println("c is greatest "+c);
}


	}

}
