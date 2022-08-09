package cp;

public class Shuffling_String 
{
	public static String shuffle(String s,int a[])
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					char t=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=t;
				}
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) 
	{
		String s= "codeleet";
		int a[]= {4,5,6,7,0,2,1,3};
		System.out.println(shuffle(s,a));
	}

}
