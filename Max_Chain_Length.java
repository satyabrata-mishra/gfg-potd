package cp;

import java.util.Arrays;

class Pair
{
	int x;
	int y;
	Pair(int a,int b)
	{
		x=a;
		y=b;
	}
}
public class Max_Chain_Length
{
	public static int maxChainLength(Pair arr[], int n)
    {
		Arrays.sort(arr,(p1,p2)->p1.y-p2.y);
		int count=1;
		if(n==0)
			return 0;
		int end = arr[0].y;
		for(int i=1;i<n;i++)
			if(end<arr[i].x)
			{
				++count;
				end=arr[i].y;
			}
		return count;
    }
	public static void main(String[] args) 
	{
		Pair[] arr= new Pair[5];
		arr[0]=new Pair(5,24);
		arr[1]=new Pair(39,60);
		arr[2]=new Pair(15,28);
		arr[3]=new Pair(27,40);
		arr[4]=new Pair(50,90);
		System.out.println(maxChainLength(arr,arr.length));
	}

}
