package cp;
public class Move_all_zeroes_to_end_of_array 
{
	static void pushZerosToEnd(int[] arr, int n)
    {
		int zero=0;
		for(int i:arr)
			if(i==0)
				zero++;
		int j=0;
		for(int i=0;i<n;i++)
			if(arr[i]!=0)
				arr[j++]=arr[i];
		for(int i=n-1;i>=0 && zero!=0;i--,zero--)
			arr[i]=0;
    }
	public static void main(String[] args) 
	{
		int Arr[] = {0,0,0,3,1,4}; //3 1 4 0 0 0
		pushZerosToEnd(Arr,Arr.length);
		for(int i:Arr)
			System.out.print(i+" ");
	}
}