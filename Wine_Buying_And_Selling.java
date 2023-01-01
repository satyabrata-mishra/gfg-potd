package cp;
public class Wine_Buying_And_Selling 
{
	public static long wineSelling(int Arr[],int N)
    {
		long ans=0;
		int i=0,j=0;//i-stores +ve index, j-stores -ve index
		while(true)
		{
			while(i<N && Arr[i]<=0)
				i++;
			while (j<N && Arr[j]>=0)
				j++;
			if(i==N || j==N)
				break;
			int change = Math.min(Arr[i], -Arr[j]);
			ans+=(Math.abs(i-j)*change);
			Arr[i]-=change;
			Arr[j]+=change;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int Arr[] = {5, -4, 1, -3, 1};
		System.out.println(wineSelling(Arr,Arr.length));
	}

}