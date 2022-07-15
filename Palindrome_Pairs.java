package trial;

public class Palindrome_Pairs
{
	public static boolean checkPalindrome(String str)
	{
		String temp=str;
		StringBuffer s=new StringBuffer(temp);
		s=s.reverse();
		temp=new String(s);
		if(temp.equalsIgnoreCase(str))
			return true;
		return false;
	}
	public static int palindromepair(int N, String arr[])
	{
		for (int i=0;i<N;i++)
			for (int j=0;j<N ;j++)
				if(i!=j)
					if(checkPalindrome(arr[i]+arr[j]))
						return 1;
		return 0;
    }
	public static void main(String[] args)
	{
		String arr[] = {"abc", "xyxcba", "geekst", "or", "bc"};
		System.out.println(palindromepair(6,arr));
//		System.out.println(checkPalindrome("geekfkeeg"));
	}

}
