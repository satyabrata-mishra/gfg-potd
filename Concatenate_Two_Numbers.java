package cp;
public class Concatenate_Two_Numbers
{
	public static int countPairs(int numbers[],int N,int X)
	{
		int count=0;
		for (int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				String str=Integer.toString(numbers[i]) + Integer.toString(numbers[j]);
				String str1=Integer.toString(X);
				if(str.equalsIgnoreCase(str1) && i!=j)
					++count;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		int num[]= {11, 11, 110};
		int x=11011;
		System.out.print(countPairs(num,num.length,x));
	}

}
