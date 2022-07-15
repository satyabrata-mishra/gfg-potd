package trial;

import java.util.Scanner;

public class Find_last_digit_of_a_power_b_for_large_numbers
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		long num=(long)Math.pow((double)a,(double)b);
		System.out.print("Last digit is "+(num%10));
	}

}
