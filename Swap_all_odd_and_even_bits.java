package trial;
import java.util.Scanner;
public class Swap_all_odd_and_even_bits
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
		for(int i=str.length()-1;i>=0;i--)
			str1=str1+str.charAt(i);
		for (int i=0;i<8-str.length();i++)
			str1="0"+str1;
		return str1;
	}
	public static int decimal(int a)
	{
		int count=0;
		double power=0;
		while(a!=0)
		{
			int temp=a%10;
			count=count+(temp*(int)Math.pow(2, power));
			power=power+1;
			a=a/10;
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int a=sc.nextInt();
		String bin_a=binary(a);
		System.out.println("In 8 bit binary "+bin_a);
		char ch[]=bin_a.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			if (i%2!=0)
			{
				char c=ch[i];
				ch[i]=ch[i-1];
				ch[i-1]=c;
			}
		}
		String x=new String(ch);
		System.out.println("After Swapping "+x);
		System.out.println("Required Result "+(decimal(Integer.parseInt(x))));
	}

}
