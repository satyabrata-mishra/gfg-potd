package cp;
import java.util.*;
public class Make_Palindrome 
{
	public static boolean makePalindrome(int n, String[] arr) 
    {
		Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            String rev = new StringBuffer(arr[i]).reverse().toString();
            if(map.containsKey(arr[i]))
                map.remove(arr[i]);
            else if(map.containsKey(rev))
                map.remove(rev);
            else
                map.put(arr[i], 1);
        }
        if(map.size() == 0)
            return true;
        if(map.size()==1)
            for(String i:map.keySet())
            	if(i.equals(new StringBuffer(i).reverse().toString()))
            		return true;
        return false;
    }
	public static void main(String[] args)
	{
		String arr[] = {"qjhpzpnsyp", "pysnpzphjq", "yrkkpohvaw", 
				"wavhopkkry", "qgaeqzqwji", "ijwqzqeagq", "korsdogmqv", "vqmgodsrok", 
				"pysnpzphjq"}; //NO
		System.out.println(makePalindrome(arr.length,arr)?"YES":"NO");
	}
}
