package trial;

public class Encrypting_A_String 
{
	public static String rev(String s)
	{
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		return str;
	}
	public static String hexa(int num)
	{
		String str="";
		if (num<16)
		{
			if (num==10)
				str="a";
			else if (num==11)
				str="b";
			else if (num==12)
				str="c";
			else if (num==13)
				str="d";
			else if (num==14)
				str="e";
			else if (num==15)
				str="f";
			else
				str=(String.valueOf(num));
		}
		else
		{
			while (num>16)
			{
				int temp=num%16;
				if (temp==10)
					str=str+"a";
				else if (temp==11)
					str=str+"b";
				else if (temp==12)
					str=str+"c";
				else if (temp==13)
					str=str+"d";
				else if (temp==14)
					str=str+"e";
				else if (temp==15)
					str=str+"f";
				else
					str=str+temp;
				num=num/16;
			}
			str=str+num;
			str=rev(str);
		}
		return str;
	}
	public static String encrypt(String s)
	{
		char ch[]=s.toCharArray();
		String str="";
		for (int i=0;i<ch.length;i++)
		{
			if (ch[i]!='*')
			{
				int count =0;
				str=str+ch[i];
				for (int j=0;j<ch.length;j++)
				{
					if (ch[i]==ch[j] && ch[j]!='*' && i!=j)
					{
						++count;
						ch[j]='*';
					}
				}
				ch[i]='*';
				++count;
				str=str+hexa(count);
			}
		}
		return (rev(str));
	}
	public static void main(String[] args)
	{
		System.out.print(encrypt("aaaaaaaaaaa"));
	}

}
