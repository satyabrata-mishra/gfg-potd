package cp;
public class Geekina_Hate_1s 
{
	public static long findNthNumer(int n, int k)
	{
		long ans=0;
		int index=0;
		while(index<n)
		{
			if(Long.bitCount(ans++)<=k)
				index++;
		}
		return ans-1;
	}
	public static void main(String[] args) 
	{
		System.out.println(findNthNumer(5,1));
		System.out.println(findNthNumer(6,2));
	}

}
