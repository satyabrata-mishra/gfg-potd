package cp;
public class Reverse_a_Linked_List_in_groups_of_given_size 
{
	public static void helper(int i,int j,int arr[])
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void reverse(int arr[], int k)
    {
		int i=0,n=arr.length;
		while(i+k-1<n)
		{
			helper(i,i+k-1,arr);
			i+=k;
		}
		if(i!=n)
			helper(i,n-1,arr);
    }
	public static void main(String[] args) 
	{
		int arr1[]= {1,2,2,4,5,6,7,8};
		reverse(arr1, 4);
		for(int i:arr1)
			System.out.print(i+" ");
		System.out.println();
		int arr2[]= {1,2,3,4,5,9};
		reverse(arr2, 3);
		for(int i:arr2)
			System.out.print(i+" ");
	}
}