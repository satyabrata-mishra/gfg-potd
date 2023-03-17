package cp;
public class Second_smallest_number 
{
	public static String firstSmallest(int S, int D)
    {
		StringBuilder temp = new StringBuilder("");
		if(S>=D*9)
			return "-1";
		if(D==1)
			return Integer.toString(S);
		D--;S--;
		while(D!=0)
		{
			if(S>=9)
			{
				temp.append(9);
				S-=9;
			}
			else
			{
				temp.append(S);
				S=0;
			}
			--D;
		}
		return temp.append(Integer.toString(S+1)).reverse().toString();	
    }
	public static String secondSmallest(int S, int D)
    {
		if(S>=D*9)
			return "-1";
		String s = firstSmallest(S,D);
		int ind = D-1;
		for(int i=D-1;i>=0;i--)
			if(s.charAt(i)=='9')
				ind = i;
			else 
				break;
		char c[] = s.toCharArray();
		c[ind]-=1;
		c[ind-1]+=1;
		return String.valueOf(c);
    }
	public static void main(String[] args)
	{
		int s=9,d=2;
		System.out.println("The first smallest " +d+" digit no with sum "+s+" is "+firstSmallest(s,d));
		System.out.println("The second smallest " +d+" digit no with sum "+s+" is "+secondSmallest(s,d));

	}

}
