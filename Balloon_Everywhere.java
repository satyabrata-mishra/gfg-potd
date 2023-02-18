package cp;
import java.util.*;
public class Balloon_Everywhere 
{
	public static int maxInstance(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char i:s.toCharArray())
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        if(map.containsKey('l'))
            map.put('l',map.get('l')/2);
        if(map.containsKey('o'))
            map.put('o',map.get('o')/2);
        int ans=Integer.MAX_VALUE;
        String temp = "balon";
        for(char i:temp.toCharArray())
            if(map.containsKey(i))
                ans=Math.min(ans,map.get(i));
        return ans;
    }
	public static void main(String[] args) 
	{
		System.out.println(maxInstance("loonbalxballpoon"));
	}

}
