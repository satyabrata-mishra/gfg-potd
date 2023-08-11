package cp;
public class Heap_Sort 
{
	void buildHeap(int arr[], int n)
    {
        for(int i=(n-2)/2; i>=0;i--)
            heapify(arr,n,i);
    }
    void heapify(int arr[], int n, int i)
    {
        int left = 2*i+1;
        int right = 2*i+2;
        int lar = i;
        if(left<n && arr[left]>arr[lar])
            lar = left;
        if(right <n && arr[right]>arr[lar])
            lar = right;
        if(lar!=i)
        {
            swap(arr,i,lar);
            heapify(arr,n,lar);
        }
    }
    public void swap(int arr[], int i, int j)
    {
    	int temp = arr[j];
    	arr[j] = arr[i];
    	arr[i] = temp;
    }
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        for(int i =n-1; i>=1; i--)
        {
            swap(arr,0,i);
            heapify(arr,i,0);
        }
    }
	public static void main(String[] args)
	{
		Heap_Sort ob = new Heap_Sort();
		int arr[] = {4,1,3,9,7};
		ob.heapSort(arr, arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}
}