package cp;
public class Squares_Of_Sorted_Arrays 
{
	public static int[] sortedSquares(int[] nums) 
	{
       int left=0,right=nums.length-1,i=nums.length-1;
       int ans[]=new int[nums.length];
       while(left<=right)
       {
    	   int l_num=Math.abs(nums[left]),r_num=Math.abs(nums[right]);
    	   if(l_num<r_num)
    	   {
    		   ans[i--]=r_num*r_num;
    		   right--;
    	   }
    	   else
    	   {
    		   ans[i--]=l_num*l_num;
    		   left++;
    	   }
       }
       return ans;
    }
	public static void main(String[] args) 
	{
		int nums[]={-7,-3,2,3,11};
		nums=sortedSquares(nums);
		for(int i:nums)
			System.out.print(i+" ");
	}
}