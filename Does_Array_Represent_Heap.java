package cp;
public class Does_Array_Represent_Heap 
{
	public static boolean countSub(long arr[], long n)
    {
		for(int i=0;i<=n/2;i++)
        {
            if((2*i+1<n&&arr[i]<arr[2*i+1])||(2*i+2<n&&arr[i]<arr[2 * i + 2]))
                return false;
        }
        return true;
    }
	public static void main(String[] args) 
	{
		long arr[] = {90, 15, 10, 7, 12, 2};
		System.out.println(countSub(arr,arr.length));
	}
}