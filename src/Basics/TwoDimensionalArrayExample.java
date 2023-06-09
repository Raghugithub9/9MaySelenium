package Basics;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		//rows and columns
		int a[][]=new int[3][4];
		
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		a[0][3]=400;
		
		a[1][0]=101;
		a[1][1]=201;
		a[1][2]=301;
		a[1][3]=401;
		
		a[2][0]=102;
		a[2][1]=202;
		a[2][2]=302;
		a[2][3]=402;
		
		//System.out.println(a[1][2]);
		
		for(int i=0;i<3;i++) {//0,1,2
			System.out.println();
			for(int j=0;j<4;j++) {//0,1,2,3---0,1,2,3,4--0,1,2,3
				System.out.print(a[i][j]+" ");
				
			}
		}
		
		

	}

}
