package cp;
public class Length_of_the_longest_subarray_with_positive_product
{
	public static int maxLength(int arr[], int n) 
    { 
		int ans = 0, pos = 0, neg = 0;
		for(int i:arr)
		{
			if(i>0)
			{
				pos+=1;
				neg=neg==0?0:1+neg;
			}
			else if(i<0)
			{
				int temp=pos;
				pos=neg==0?0:1+neg;
				neg=1+temp;
			}
			else
				pos=neg=0;
			ans=Math.max(ans,pos);
		}
		return ans;
    }
	public static void main(String[] args) 
	{
		int arr[] ={-1, -2, 0, 1, 2};
		System.out.println(maxLength(arr,arr.length));
	}

}
