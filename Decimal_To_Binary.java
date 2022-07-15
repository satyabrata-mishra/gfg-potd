// package trial;
import java.util.Scanner;
public class Day8
{
	static int count=0;
	public static void binaryconvert(int n)
	{
		int temp=n;
		String bin=""; 
		while(temp!=0 && temp!=1)
		{
			int x=temp%2;
			bin=bin+x;
			temp=temp/2;
		}
		bin=bin+temp;
		StringBuffer s=new StringBuffer(bin);
		s.reverse();
		for (int i=0;i<s.length();i++)
			if(s.charAt(i)=='1')
				count++;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
			binaryconvert(i);
		System.out.println(count);
	}
}