package cp;
public class Minimum_Operation_to_reach_n_from_0 
{
	public static int minOperation(int n)
    {
		int ans=0;
		while(n!=0)
		{
			if(n%2==0)
				n/=2;
			else
				n--;
			++ans;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(minOperation(8));
		System.out.println(minOperation(7));
	}
}