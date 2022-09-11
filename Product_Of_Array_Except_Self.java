package cp;

public class Product_Of_Array_Except_Self
{
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
		long prod = 1,flag = 0;
		for(int i:nums)
			if(i==0)
				++flag;
			else
				prod*=i;
		long ans[] = new  long[n];
		for(int i = 0;i<n;i++)
		{
			if(flag>1)
				ans[i]=0;
			else if(flag==0)
				ans[i]=(prod/nums[i]);
			else if (flag == 1 && nums[i] != 0) 
				ans[i] = 0;
            else
            	ans[i] = prod;
		}
		return ans;
		
	} 
	public static void main(String[] args) 
	{
		int nums[] = {10, 3, 5, 6, 2};
		long ans[] = productExceptSelf(nums,nums.length);
		for(long i:ans)
			System.out.print(i+" ");
	}

}
