package cp;

public class Mo_s_Algorithm 
{
	static void combinationUtil(int arr[],int i,int data[],int index, int n, int r)
	{
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}
		if (i >= n)
			return;
		data[index] = arr[i];
		combinationUtil(arr,i+1,data,index+1,n,r);
		combinationUtil(arr,i+1,data,index,n,r);
	}
	public static void main(String[] args) 
	{
	  int arr[] = {1, 2, 3, 4};
        int r = 2;
        int n = arr.length;
        int data[]=new int[r];
        combinationUtil(arr,0,data,0,n,r);
	}

}
