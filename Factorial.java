package trial;

import java.util.Scanner;

public class Day5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int temp=1;
		for (int i=1;i<=num;i++)
			temp=temp*i;
		System.out.println("Factorial of "+num+" is "+temp);
	}
}
