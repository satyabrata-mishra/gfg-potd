package cp;
public class Smallest_Positive_missing_number 
{
	public static int missingNumber(int arr[], int size)
    {
		for(int i=0;i<size;i++)
        {
            if(arr[i]<=size && arr[i]>0 && arr[arr[i]-1]!=arr[i])
            {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
                i--;
            }
        }
        for(int i=0;i<size;i++)
            if(arr[i]!=i+1)
            	return i+1;
        return size+1;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		System.out.println(missingNumber(arr,arr.length));
	}
}