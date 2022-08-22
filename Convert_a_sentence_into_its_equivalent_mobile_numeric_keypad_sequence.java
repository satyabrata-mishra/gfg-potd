package cp;
import java.util.*;
public class Convert_a_sentence_into_its_equivalent_mobile_numeric_keypad_sequence 
{
	public static String printSequence(String S) 
    { 
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(2, "ABC");
        hm.put(3, "DEF");
        hm.put(4, "GHI");
        hm.put(5, "JKL");
        hm.put(6, "MNO");
        hm.put(7, "PQRS");
        hm.put(8, "TUV");
        hm.put(9, "WXYZ");
        hm.put(0, " ");
        String ans="";
        for(int i=0;i<S.length();i++)
        {
        	char ch = S.charAt(i);
        	for(int j:hm.keySet())
        	{
        		int ind = hm.get(j).indexOf(ch);
        		if(ind==-1)
        			continue;
        		for(int x=0;x<=ind;x++)
        			ans+=j;
        	}
        }
        return ans;
    }
	public static void main(String[] args)
	{
		System.out.println(printSequence("HEY U"));
	}

}
