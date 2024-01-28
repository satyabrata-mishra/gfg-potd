//Find a element occurring only once, without using any extra space
//Every element appears thrice except for one which occurs once is guaranteed.
//Approach 1 -> (sum of unique elements * 3 - sum of elements in array)/2
//Approach 2 -> Formula to find nth bit (number & 1 << n)>>n
package cp;
public class Find_element_occuring_once
{
	static int singleElement(int[] arr , int N) 
    {
		int ans=0;
		for(int i=0;i<32;i++)
		{
			int ones=0,mask=1<<i;
			for(int j:arr)
				if((j&mask)!=0)
					ones++;
			if(ones%3!=0)
				ans|=mask;
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] = {-32,-19,-32,-32};
		System.out.println(singleElement(arr,arr.length));
	}
}