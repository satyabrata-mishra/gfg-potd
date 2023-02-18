package cp;

public class Minimum_Days 
{
	public static int getMinimumDays(int N, String S, int[] P) 
    {
		int total_same = 0, string_len = S.length();
		for(int i=0;i<string_len-1;i++)
			if(S.charAt(i)==S.charAt(i+1))
				total_same+=1;
		if(total_same==0)
			return 0;
		char arr[] = S.toCharArray();
		for(int days=0;days<N;days++)
		{
			int temp = P[days];
			if(temp-1>=0 && arr[temp]==arr[temp-1])
				total_same-=1;
			if(temp+1<N && arr[temp]==arr[temp+1])
				total_same-=1;
			arr[temp]='?';
			if(total_same==0)
				return days+1;
		}
		return N;
    }
	public static void main(String[] args) 
	{
		String S = "aabb";
		int P[] = {2, 1, 3, 0};
		System.out.println(getMinimumDays(P.length,S,P));
	}

}
