package cp;
public class Word_Wrap 
{
	public static int solveWordWrap(int[] nums, int k)
    {
        int n = nums.length, sum = 0;
        int costArray[] = new int[n];
        for(int i=0;i<n;++i) 
        {
            if(i == 0) 
                sum += nums[i];
            else 
                sum = sum + nums[i] + 1;
            if(sum <= k) 
                costArray[i] = (k - sum) * (k - sum);
            else 
                costArray[i] = Integer.MAX_VALUE;
        }
        int minCostArray[] = new int[n];
        for(int i=0;i<n;++i) 
        {
            int minTillCurr = Integer.MAX_VALUE, sumAfterSplit = 0;
            for(int j=i;j>=0;--j) 
            {
                if(j == i) 
                {
                    if(costArray[j] != Integer.MAX_VALUE) 
                    {
                        if(i == n-1) 
                            minTillCurr = 0;
                        else 
                            minTillCurr = Math.min(costArray[j], minTillCurr);
                    }
                    sumAfterSplit += nums[j];
                }
                else if(i == n-1) 
                {
                    if(sumAfterSplit <= k) 
                        minTillCurr = Math.min(minCostArray[j], minTillCurr);
                    sumAfterSplit = sumAfterSplit + nums[j] + 1;
                }
                else 
                {
                    if(sumAfterSplit <= k) 
                    {
                        int costAfterSplit =  (k - sumAfterSplit) * (k - sumAfterSplit);
                        minTillCurr = Math.min(minCostArray[j] + costAfterSplit, minTillCurr);
                    }
                    sumAfterSplit = sumAfterSplit + nums[j] + 1; //1 is added for a blankspace in between two words
                }
            }
            minCostArray[i] = minTillCurr;
        }
        return minCostArray[n-1];
    }
	public static void main(String[] args) 
	{
		int nums[] = {3,2,2,5};
		int k = 6;
		System.out.println(solveWordWrap(nums,k));
	}

}
