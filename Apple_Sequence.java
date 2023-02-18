package cp;
public class Apple_Sequence 
{
	public static int appleSequence(int n, int m, String arr)
    {
		int j = 0, orange = 0,maxi=0;
		for(int i=0;i<n;i++)
		{
			if(arr.charAt(i)=='O')
				orange++;
			while(orange>m)
			{
				if(arr.charAt(j)=='O')
					orange--;
				j++;
			}
			maxi = Math.max(maxi, i-j+1);
		}
		return maxi;
    }
	public static void main(String[] args) 
	{
		String str = "AAOAO";
		System.out.println(appleSequence(str.length(),1,str));
	}

}
