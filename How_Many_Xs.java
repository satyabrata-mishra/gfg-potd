package cp;
public class How_Many_Xs 
{
	int countX(int L, int R, int X) 
	{
		int ans=0;
		for(int i=L+1;i<R;i++)
		{
			int temp=i;
			while(temp>0)
			{
				if(temp%10==X)
					++ans;
				temp/=10;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(new How_Many_Xs().countX(10, 19, 1));
	}
}