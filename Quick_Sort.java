package cp;
public class Quick_Sort 
{
	static void quickSort(int arr[], int low, int high)
    {
        if(low>=high) 
            return;
        int p=partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        int p = arr[high], i = low - 1;
        for(int j = low; j < high; j++)
            if(arr[j] <= p)
                swap(arr, ++i, j);
        swap(arr, ++i, high);
        return i;
    } 
    static void swap(int arr[], int i, int j) 
    {
        arr[i] ^= arr[j] ^ (arr[j] = arr[i]);
    }
	public static void main(String[] args) 
	{
		int arr[] = { 4, 1, 3, 9, 7};
		quickSort(arr,0,arr.length-1);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
//Quick Sort is a Divide and Conquer algorithm. It picks an element 
//as a pivot and partitions the given array around the picked pivot.