package cp;
import java.util.*;
public class ZigZiag_Traversal_Of_A_2D_Array
{
	static ArrayList<Integer> downwardDigonal(int n, int A[][])
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int k=0;k<n;k++)
		{
			int i = 0;
			int j = k;
			while(j>=0 && i<n)
			{
				ans.add(A[i][j]);
				++i;--j;
			}
		}
		for(int k=1;k<n;k++)
		{
			int i=k;
			int j=n-1;
	        while(j>=1 && i<n)
	        {
	        	ans.add(A[i][j]);
	            i++;
	            j--;

	         }    
		}
		return ans;
	}
	public static void main(String[] args) 
	{
//		25 79 59
//		63 65 6 
//		46 82 28
		int a[][]= {{25, 79, 59}, {63, 65, 6}, {46, 82, 28}}; 
		System.out.println(downwardDigonal(a.length,a));
	}

}
