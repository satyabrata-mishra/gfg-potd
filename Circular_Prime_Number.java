package trial;
import java.util.Scanner;
public class Circular_Prime_Number
{
	public static boolean isprime(int a)
	{
		int temp=0;
		for (int i=2;i<a;i++)
			if (a%i==0)
			{
				temp=1;
				break;
			}
		if (temp==0)
			return true;
		else
			return false;
	}
	public static void permutations(int a)
	{
		int temp=a,count =0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=a;
		int confirm=0;
		System.out.print("Permutations of the given numbers are ");
		while (true)
		{
			System.out.print(temp+" ");
			if(isprime(temp)== false)
			{
				confirm=1;
			}
//			Logic To Find The Permutations Of A Given Number
			int rem=temp%10;
			int div=temp/10;
			temp=(int)(Math.pow(10,count-1)*rem+div);
			if (temp==a)
				break;
		}
		System.out.println();
		if (confirm==0)
			System.out.println("The Number Is A Circular Prime Number.");
		else
			System.out.println("The Number Is Not A Circular Prime Number.");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number To Check Weather Its Circular Prime Or Not:");
		int a=sc.nextInt();
		permutations(a);
	}
}
