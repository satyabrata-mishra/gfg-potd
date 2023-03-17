package cp;
public class Max_Min_Height 
{
	public static boolean isPossible(int n, int a[], int k,int w,int mid)
	{
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=a[i];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<mid)
			{
				int temp=mid-arr[i];
				if(temp>k)
					return false;
				k-=temp;
				arr[i]=mid;
				for(int j=i+1;j<n && j<i+w;j++)
					arr[j]+=temp;
			}
		}
		return true;
	}
	public static long maximizeMinHeight(int n, int k, int w,int [] a)
    {
		long ans=0;
		int min = Integer.MAX_VALUE;
		for(int i:a)
			if(i<min)
				min=i;
		int max = min+k;
		while(min<=max)
		{
			int mid = min+(max-min)/2;
			if(isPossible(n,a,k,w,mid))
			{
				ans=mid;
				min=mid+1;
			}
			else
				max=mid-1;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int k=2,w=3;
		int a[]={2,2,2,2,1,1};
		System.out.println(maximizeMinHeight(a.length,k,w,a));
	}
}