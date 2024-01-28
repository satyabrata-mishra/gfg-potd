package cp;
public class Inplace_Rotate_Matrix_90_Degree 
{
	public static void inplaceRotate(int[][] arr, int n) 
	{
		for(int i=0;i<n;i++)
		{
			int low=0,high=n-1;
			while(low<=high)
			{
				int temp=arr[i][low];
				arr[i][low]=arr[i][high];
				arr[i][high]=temp;
				low++;
				high--;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		inplaceRotate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}