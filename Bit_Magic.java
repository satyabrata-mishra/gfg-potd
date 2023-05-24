package cp;
public class Bit_Magic 
{
	public static int bitMagic(int n, int[] arr)
    {
		int i=0,j=n-1,ans=0;
		while(i<=j)
		{
			if(arr[i]!=arr[j])
				++ans;
			i++;
			j--;
		}
		return ans%2==0?ans/2:ans/2+1;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1,0,0,0};
		System.out.println(bitMagic(arr.length,arr));
	}
}