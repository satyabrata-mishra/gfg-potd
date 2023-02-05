package cp;
import java.util.*;
public class Find_the_longest_string 
{
	public static String longestString(int n, String[] arr) 
    {
		Arrays.sort(arr); 
        String longest = ""; 
        for (String s : arr) 
        {
            boolean valid = true; 
            for (int i = 1; i <= s.length(); i++) 
            {
                String prefix = s.substring(0, i);
                if (!Arrays.asList(arr).contains(prefix)) 
                { 
                    valid = false; 
                    break; 
                }
            }
            if (valid && s.length() > longest.length()) 
                longest = s; 
        }
        return longest;
    }
	public static void main(String[] args) 
	{
		String str[]= {"ab","a","abc","abd"};
		System.out.println(longestString(str.length,str));
	}
}