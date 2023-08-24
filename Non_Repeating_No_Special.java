package cp;
public class Non_Repeating_No_Special 
{
	public static int[] singleNumber(int[] nums)
    {
		int numSum=0,n1=0,n2=0;
        for(int i = 0; i < nums.length; i++)
            numSum ^= nums[i];
        numSum = (numSum & -numSum);
        for(int i = 0; i < nums.length; i++)
        {    
            if((nums[i] & numSum) > 0)
                n1 ^= nums[i];
            else
                n2 ^= nums[i];
        }
        int[] res = {Math.min(n1, n2), Math.max(n1, n2)};
        return res;
    }
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 2, 1, 4};
		arr=singleNumber(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}