package cp;

public class Closest_Palindrome 
{
	public static boolean isPalindrome(long n)
	{
		String s = Long.toString(n); 
		int left = 0;
	    int right = s.length() - 1;
	    while (left < right)
	    {
	        if (s.charAt(left) !=s.charAt(right))
	            return false;
	        left++;
	        right--;
	    }
	    return true;
	}
	public static long closestPalindrome(long num)
    {
        // Code here
	    if(isPalindrome(num))
            return num;
	    long minnum=num-1;
	    while(!isPalindrome(minnum))
	    	minnum-=1;
	    long maxnum=num+1;
	    while(!isPalindrome(maxnum))
	    	maxnum+=1;
	    if(Math.abs(num-minnum)==Math.abs(num-maxnum))
	    	return (Math.min(minnum, maxnum));
	    else if(Math.abs(num-minnum)<Math.abs(num-maxnum))
	    	return (minnum);
	    else
	    	return (maxnum);
    }
	public static void main(String[] args) 
	{
		System.out.println(closestPalindrome(489)); //484
	}

}
