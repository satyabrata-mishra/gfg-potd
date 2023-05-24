package cp;
public class Trace_Path 
{
	public static int isPossible(int n, int m, String s)
    {
		int u=0,d=0,l=0,r=0;
		for(int i=0;i<s.length();i++)
		{
			char temp = s.charAt(i);
			if(temp == 'U')
			{
				u++;
				if(u == n) return 0;
				if(d > 0) d--;
			}
			else if(temp == 'D')
			{
				d++;
				if(d == n) return 0;
				if(u > 0) u--;
			}
			else if(temp == 'L')
			{
				l++;
				if(l == m) return 0;
				if(r > 0) r--;
			}
			else if(temp == 'R')
			{
				r++;
				if(r == m) return 0;
				if(l > 0) l--;
			}
		}
		return 1;
    }
	public static void main(String[] args) 
	{
		System.out.println(isPossible(2,3,"LRRU"));
	}
}
