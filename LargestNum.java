package operation;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,n4,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		n1 = sc.nextInt();
		System.out.println("Enter second number:");
		n2 = sc.nextInt();
		//l = (n1>n2)?n1:n2;
		//System.out.println("Largest of "+n1+" and "+n2+" is "+l);
		
		System.out.println("Enetr third number:");
		n3 = sc.nextInt();
		System.out.println("Enetr third number:");
		n4 = sc.nextInt();
		
		//l = (n1>n2 && n1>n3) ?n1:(n2>n1 && n2>n3) ?n2:n3;
		//System.out.println("Largest of "+n1+" , "+n2+" and "+n3+" is "+l);
		
		l = (n1>n2 && n1>n3 && n1>n4) ?n1:(n2>n1 && n2>n3 && n2>n4) ?n2:(n3>n1 && n3>n2 && n3>n4) ?n3:n4;
		System.out.println("Largest of "+n1+" , "+n2+" , "+n3+" , "+n4+" is "+l);
				
	}

}
