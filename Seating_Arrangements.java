package cp;
public class Seating_Arrangements 
{
	public static boolean is_possible_to_get_seats(int n, int m, int[] seats) 
    {
		if(seats[0]==0 && seats[1]==0)
		{
			seats[0]=1;
			--n;
		}
		for(int i=1;i<m-1 && n!=0;i++)
		{
			if(seats[i]==0 && seats[i-1]==0 && seats[i+1]==0)
			{
				seats[i]=1;
				--n;
			}
		}
		if(seats[m-1]==0 && seats[m-2]==0 && n!=0)
		{
			n--;
			seats[m-1]=1;
		}
		if(n==0)
			return true;
		return false;
    }
	public static void main(String[] args) 
	{
		int n = 2;
		int seats[] = {0, 0, 1, 0, 0, 0, 1};
		System.out.println(is_possible_to_get_seats(n,seats.length,seats)?"Yes":"No");
	}
}