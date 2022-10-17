package cp;
import java.util.*;
public class Save_Your_Life 
{
	static String maxSum(String w,char x[],int b[], int n)
    {
		HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(x[i] , b[i]);
        int mxend, mxsofar;
        if(map.containsKey(w.charAt(0)))
        {
        	mxend = map.get(w.charAt(0));
            mxsofar = mxend;
        }
        else
        {
        	mxend = w.charAt(0);
        	mxsofar = mxend;
        }
        String res = ""+w.charAt(0), t = ""+w.charAt(0);
        for(int i = 1; i < w.length(); i++)
        {
        	char ch = w.charAt(i);
            int temp;
            if(map.containsKey(ch)) 
            	temp = map.get(ch);
            else
            	temp = ch;
            if(mxend + temp > temp)
            {
                t += ch;
                mxend = mxend + temp;
            }
            else
            {
                t = "";
                t += ch;
                mxend = temp;
            }
            if(mxsofar < mxend)
            {
                res = t;
                mxsofar = mxend;
            }
        }
        return res;
    }
	public static void main(String[] args) 
	{
		String W = "abcde";
		char X[] = { 'c' };
		int B[] = { -1000 };
		System.out.println(maxSum(W,X,B,B.length));
	}

}