package cp;
public class Sort_By_Set_Bit_Count
{
	public static void sortBySetBitCount(Integer arr[], int n)
    { 
		Integer count[]=new Integer[n];
		for (int i=0;i<n;i++)
			count[i]=Integer.bitCount(arr[i]);
		for (int i=0;i<n-1;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if(count[j]<count [j+1])
				{
					int temp=count[j];
					count[j]=count[j+1];
					count[j+1]=temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
    } 
	public static void main(String[] args)
	{
		Integer arr[]= {5, 2, 3, 9, 4, 6, 7, 15, 32};
		sortBySetBitCount(arr,arr.length);
		
	}

}
