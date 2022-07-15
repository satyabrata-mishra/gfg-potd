package cp;

public class XOR_Game
{
	public static int xorCal(int k)
	{
		if (k==1)
			return 2;
		int temp=Integer.MAX_VALUE;
		for (int i=1;i<=k;i++)
		{
			int xorvalue=i ^ i+1;
			if (xorvalue==k && i<temp)
				temp=i;
		}
		if(temp==Integer.MAX_VALUE)
			return -1;
		return temp;
		
    }
	public static void main(String[] args)
	{
		System.out.println(xorCal(1));
	}

}
