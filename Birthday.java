package trial;
import java.util.Scanner;
public class Birthday
{
	public static String binary(int a)
	{
		String str="";
		while(a!=0 && a!=1)
		{
			int temp=a%2;
			str=str+temp;
			a=a/2;
		}
		str=str+a;
		String str1="";
		for (int i=str.length()-1;i>=0;i--)
			str1=str1+str.charAt(i);
		return str1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String a1=binary(a);
		String b1=binary(b);
		int temp=0;
		if (a1.length()>b1.length())
		{
			int x=a1.length()-b1.length();
			for (int i=0;i<x;i++)
				b1="0"+b1;
			for (int i=0;i<b1.length();i++)
			{
				if (a1.charAt(i)!=b1.charAt(i))
					++temp;
			}
		}
		else if(b1.length()>a1.length())
		{
			int x=b1.length()-a1.length();
			for (int i=0;i<x;i++)
				a1="0"+a1;
			for (int i=0;i<a1.length();i++)
			{
				if (a1.charAt(i)!=b1.charAt(i))
					++temp;
			}
		}
		else
		{
			for (int i=0;i<a1.length();i++)
			{
				if (a1.charAt(i)!=b1.charAt(i))
					++temp;
			}
		}
		System.out.println("Minimum Changes "+temp);
	}

}
