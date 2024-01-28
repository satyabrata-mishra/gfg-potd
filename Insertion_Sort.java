package cp;
public class Insertion_Sort 
{
	public static void insertionSort(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int temp=arr[i],j=i-1;
			for(;j>=0;j--)
			{
				if(arr[j]>temp)
					arr[j+1]=arr[j];
				else
					break;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,7,4,9,3,5,6,0,8,2};
		insertionSort(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
