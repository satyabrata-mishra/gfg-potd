package cp;
import java.util.*;
public class Min_Sum_Formed_By_Digits
{
	 public static long minSum(int arr[], int n)
	 {
		 String s1="0",s2="0";
		 Arrays.sort(arr);
		 for (int i=0;i<n;i++)
			 if(i%2==0)
				 s1+=arr[i];
			 else
				 s2+=arr[i];
		 return Long.parseLong(s1) + Long.parseLong(s2);
	 }
	public static void main(String[] args) 
	{
		int arr[] =  {0};
		System.out.println(minSum(arr , arr.length));
	}

}
