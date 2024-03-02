package cp;
public class Peak_Element 
{
	public static int peakElement(int[] arr,int n)
    {
		int i=0,j=n-1,ans=0;
		while(i<j)
		{
			if(arr[i]<arr[j])
			{
				ans=j;
				i++;
			}
			else if(arr[i]>=arr[j])
			{
				ans=i;
				j--;
			}
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3};
		System.out.println(peakElement(arr,arr.length));
	}
}