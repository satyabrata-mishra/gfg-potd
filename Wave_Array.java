package cp;
public class Wave_Array 
{
	public static void convertToWave(int n, int[] a) 
    {
		for(int i=0;i<n-1;i+=2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
    }
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6};
		convertToWave(arr.length, arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}