package cp;

public class Palindromic_Pair 
{
	static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        return true;
    }
	static int palindromepair(int N, String arr[]) 
    {
        int count = 0;
        for(int i=0;i<N-1;i++)
            for(int j=i+1;j<N;j++)
                if(isPalindrome(arr[i]+arr[j]))
                	++count;
        return count;
    }
	public static void main(String[] args) 
	{
		String arr[] = {"geekf", "geeks", "or","keeg", "abc", "bc"};
		System.out.println(palindromepair(arr.length,arr));
	}

}
