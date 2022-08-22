package cp;

public class Game_With_Nos 
{
	public static int xorCalculator(int a,int b)
	{ 
		return (a|b) & (~a|~b);
	}
	public static int[] game_with_number (int arr[], int n) 
    {
		int ans[]=new int[n];
		for(int i=0;i<n-1;i++)
			ans[i]=xorCalculator(arr[i],arr[i+1]);
		ans[n-1]=arr[n-1];
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {5, 9, 7, 6};
		arr=game_with_number(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
