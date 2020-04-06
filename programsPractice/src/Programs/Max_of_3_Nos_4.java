package Programs;

import java.util.Scanner;

public class Max_of_3_Nos_4 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		a=in.nextInt();
		
		System.out.println("Enter value of b:");
		b=in.nextInt();
		
		System.out.println("Enter value of c:");
		c=in.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is big number.");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is big number.");
		}
		else
			System.out.println("c is big number.");
	}

}
