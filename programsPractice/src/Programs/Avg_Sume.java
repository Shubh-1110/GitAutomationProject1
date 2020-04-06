package Programs;

import java.util.Scanner;

public class Avg_Sume {
	public static void main(String[] args) {
		int a,b,sum;
		float avg;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number:");
		a=input.nextInt();
		
		System.out.println("Enter second number:");
		b=input.nextInt();
		
		sum=a+b;
		
		System.out.println("Sum of a&b is:"+sum);
		
		avg=sum/2;
		
		System.out.println("Average of a&b is:"+avg);
	}

}
