package cp;
public class Reach_the_Nth_point 
{
	public static int nthPoint(int n)
    {
		if(n==1) 
            return 1;
        if(n==2) 
            return 2;
        int first = 1, second = 2;
        for(int i=3;i<=n;i++) 
        {
            int temp = (first+second)%1000000007;
            first = second;
            second = temp;
            System.out.println(temp);
        }
        return second;
    }
	public static void main(String[] args) 
	{
		System.out.println(nthPoint(4));
	}
}