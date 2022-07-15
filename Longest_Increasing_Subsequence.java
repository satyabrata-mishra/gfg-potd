package cp;
public class Longest_Increasing_Subsequence 
{
	public static void longestSubsequence(int[] a,int n)
	{
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
			temp[i]=1;
		for(int i=1;i<n;i++)
			for(int j=0;j<i;j++)
				if(a[i]>a[j])
					temp[i]=(int)Math.max(temp[i], temp[j]+1);
		for(int j:temp)
			System.out.print(j+" ");
	}
	public static void main(String[] args) 
	{
//		int a[]= {7, 3, 2, 5}; //A Unique Case
		int a[]= {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15}; //1 2 2 3 2 3 3 4 2 4 3 5 3 5 4 6 
		longestSubsequence(a,a.length);
	}

}
