package Programs;

import java.util.Scanner;

public class Avg_Sum2 {
	public static void main(String[] args) {
		int a,b,sum;
		float avg;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		a=in.nextInt();
		
		System.out.println("Enter value of b:");
		b=in.nextInt();
		
		sum=a+b;
		avg=sum/2;
		
		System.out.println("sum of a&b is:"+sum+"\nAverage of a&b is:"+avg);
	}

}
