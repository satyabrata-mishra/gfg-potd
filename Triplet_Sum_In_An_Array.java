package cp;
import java.util.*;
public class Triplet_Sum_In_An_Array 
{
	public static boolean find3Numbers(int A[], int n, int X) //Finding weather a triplet exists or not?
    { 
        int l, r;
        Arrays.sort(A);
        for (int i = 0; i < n - 2; i++)
        { 
            l = i + 1; 
            r = n - 1; 
            while (l < r) 
                if (A[i] + A[l] + A[r] == X)  
                	return true;
                else if (A[i] + A[l] + A[r] < X) 
                    l++; 
                else
                    r--; 
        }
        return false;
    }
	public static void triplets(int arr[],int n,int x) //Printing all the triplets
	{
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
					if(arr[i]+arr[j]+arr[k]==x)
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
	}
	public static void main(String[] args)
	{
		int arr[] = {1, 4, 45, 6, 10, 8,3};
		int sum=13;
		System.out.println(find3Numbers(arr,arr.length,sum));
		triplets(arr,arr.length,sum);
	}

}
