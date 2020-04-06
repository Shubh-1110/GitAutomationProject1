package Programs;

import java.util.Scanner;

public class Sum_Avg_3 {
	public static void main(String[] args)
	{
		float a,b,sum;
		float avg;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		a=in.nextFloat();
		
		System.out.println("Enter value of b:");
		b=in.nextFloat();
		
		sum=a+b;
		avg=sum/2;
		
		System.out.println("Sum of a & b is:"+sum+"\nAverage of a & b is:"+avg);
	}

}
