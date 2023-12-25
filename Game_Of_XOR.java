package cp;
public class Game_Of_XOR 
{
	static int gameOfXor(int n, int[] arr) 
    {
		int ans = 0;
        for(int i=0; i<n; i++)
        {
            int cnt = (i+1)*(n-i);
            if(cnt%2==1) 
            	ans^=arr[i];
        }
        return ans;
    }
	public static void main(String[] args) 
	{
		int A[]={1,2,3};
		System.out.println(gameOfXor(A.length, A));
	}
}