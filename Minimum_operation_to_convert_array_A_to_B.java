package trial;
import java.util.Scanner;
public class Minimum_operation_to_convert_array_A_to_B
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the 1st array:");
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the size of 2nd array");
		int m=sc.nextInt();
		int b[]=new int[m];
		System.out.println("Enter the 2nd array:");
		for (int i=0;i<m;i++)
			b[i]=sc.nextInt();
		int minop=0;
		if(n>m)
		{
			minop=n-m;
			for (int i=0;i<m;i++)
			{
				if (a[i]!=b[i])
					minop=minop+2;
			}
		}
		else if (n<m)
		{
			minop=m-n;
			for (int i=0;i<n;i++)
			{
				if (a[i]!=b[i])
					minop=minop+2;
			}
		}
		else
		{
			for (int i=0;i<n;i++)
			{
				if (a[i]!=b[i])
					minop=minop+2;
			}
		}
		if (minop==0)
			System.out.println("Both the arrays are already identical!");
		else
			System.out.println("Minimum "+minop+" steps required to make both the arrays identical.");
	}

}
