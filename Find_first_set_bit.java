package cp;
public class Find_first_set_bit 
{
	public static int getFirstSetBit(int n)
    { 
		int ans=1;
		while(n!=0)
		{
			if(n%2!=0)
				return ans;
			++ans;
			n/=2;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(getFirstSetBit(18));
	}
}