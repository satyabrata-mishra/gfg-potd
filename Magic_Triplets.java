//(a[i], a[j], a[k]) is called a Magic Triplet if a[i] < a[j] < a[k] and i < j < k. 
package cp;
public class Magic_Triplets 
{
	public static int countTriplets(int[] nums)
    {
		int n=nums.length;
        if(n<3)
            return 0;
        int ans=0;
        for (int i = 1; i < nums.length-1; i++) 
        {
            int small=0;
            for (int j = 0; j < i; j++)
                if(nums[j]<nums[i])
                    small++;
            int large=0;
            for(int k=i+1;k<n;k++)
                if(nums[k]>nums[i])
                    large++;
            ans+=(small*large);
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		System.out.println(countTriplets(arr));
	}

}
