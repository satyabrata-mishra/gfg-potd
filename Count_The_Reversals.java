package trial;
import java.util.Scanner;
public class Count_The_Reversals
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string: ");
		String str1=sc.next();
		String str=str1;
		char ch[]=str.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			if (ch[i]=='{')
			{
				for (int j=i;j<ch.length;j++)
				{
					if(ch[j]=='}')
					{
						ch[i]='*';
						ch[j]='*';
						break;
					}
				}
			}
		}
//		for (int i=0;i<ch.length;i++)
//			System.out.print(ch[i]);
		int changes=0;
		if (ch[0]=='}')
		{
			ch[0]='{';
			changes++;
		}
		for (int i=0;i<ch.length;i++)
		{
			if (ch[i]=='{')
			{
				for (int j=i+1;j<ch.length;j++)
				{
					if (ch[j]=='{')
					{
						ch[j]='}';
						changes++;
						ch[i]='*';
						ch[j]='*';
						break;
					}
				}
			}
			else if (ch[i]=='}')
			{
				for (int j=i+1;j<ch.length;j++)
				{
					if (ch[j]=='}')
					{
						ch[j]='{';
						changes++;
						ch[i]='*';
						ch[j]='*';
						break;
					}
				}
			}
		}
//		for (int i=0;i<ch.length;i++)
//		{
//			System.out.print(ch[i]);
//		}
		int count=0;
		for (int i=0;i<ch.length;i++)
			if (ch[i]=='*')
				++count;
		if (count==ch.length)
			System.out.print(changes);
		else
			System.out.print("-1");
	}
}