package cp;

public class Even_Swap 
{
	public static int[] lexicographicallyLargest(int [] arr, int n) 
	{
		boolean flag=true;
		while(flag)
		{
			flag=false;
			for(int i=0;i<n-1;i++)
			{
				if(((arr[i]+arr[i+1]) & 1)==0 && arr[i]<arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		int a[]={1,3,5};
		a=lexicographicallyLargest(a,a.length);
		for(int i:a)
			System.out.print(i+" ");
	}

}
