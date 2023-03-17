//Ques:Given an array arr of size n, the task is to 
//find the maximum triplet product in the array.
//Ans:The answer will always be maximum of product of Maximum, 
//second maximum and third maximum and product of Minimum, 
//second minimum and Maximum element.
package cp;
public class Maximum_Triplet_Product 
{
	public static Long maxTripletProduct(Long arr[], int n)
    {
		Long max1,max2,max3,min1,min2;
		max1=max2=max3=Long.MIN_VALUE;
		min1=min2=Long.MAX_VALUE;
		for(long i:arr)
		{
			if(max1<i)
			{
				max3=max2;
				max2=max1;
				max1=i;
			}
			else if(max2<i)
			{
				max3=max2;
				max2=i;
			}
			else if(max3<i)
				max3=i;
			if(min1>i)
			{
				min2=min1;
				min1=i;
			}
			else if(min2>i)
				min2=i;
		}
		return Math.max(max1*max2*max3, max1*min1*min2);
    }
	public static void main(String[] args) 
	{
		Long arr[] = {-3l, -5l, 1l, 0l, 8l, 3l, -2l};
		System.out.println(maxTripletProduct(arr,arr.length));	
	}

}
