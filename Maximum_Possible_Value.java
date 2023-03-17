package cp;

public class Maximum_Possible_Value 
{
	public static long maxPossibleValue(int N, int A[] ,int B[]) 
    { 
		long ans=0,sticks=0,min=Long.MAX_VALUE;
		for(int i=0;i<N;i++)
		{
			long len=A[i],count=B[i];
			count=(count&1)==0?count:count-1;
			if(count>=2)
			{
				min=Math.min(min, len);
			    ans+=len*count;
			    sticks+=count;
			}
		}
		if(sticks%4!=0)
			ans-=min*2;
		return ans;
    }
	public static void main(String[] args) 
	{
		int A[] = {3,4,6,5};
		int B[] = {2,3,1,6};
		System.out.println(maxPossibleValue(A.length,A,B));
	}

}
