package cp;
public class Fest_And_Posters
{
	public static long minimumTime(int N,int NUM,int time[])
    {
		long left=0,right=Long.MAX_VALUE,ans=0;
		while(left<=right)
		{
			long mid=left+(right-left)/2,count=0;
			for(int i=0;i<N && count<NUM;i++)
				count+=mid/time[i];
			if(count<NUM)
				left=mid+1;
			else
			{
				ans=mid;
				right=mid-1;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int time[]= {2,3,1,4};
		int num=10;
		System.out.println(minimumTime(time.length,num,time));
	}
}