package cp;
public class Ticket_Counter 
{
	public static int distributeTicket(int N,int K)
    {
		boolean first=true,last=false;
        int low=1,high=N;
        while(low<high)
        {
        	if(first)
        		low+=K;
        	else
        		high-=K;
        	first=!first;
            last=!last;
        }
        if(first)
    		return low;
    	return high;
    }
	public static void main(String[] args) 
	{
		System.out.println(distributeTicket(9,3));
	}
}