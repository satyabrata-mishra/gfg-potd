package cp;
import java.util.*;
class query
{
    String type,a,b,c;
    public query(String type,String a,String b,String c)
    {
        this.type=type;
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
public class Easy_Task 
{
	public static ArrayList<Character> easyTask(int n,String s,int q,query queries[])
    {
        ArrayList<Character> ans = new ArrayList<>();
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<q;i++)
        {
            if(queries[i].type=="1")
                sb.setCharAt(Integer.parseInt(queries[i].a),queries[i].b.charAt(0));
            else
            {
                int start=Integer.parseInt(queries[i].a);
                int end=Integer.parseInt(queries[i].b);
                int kth=Integer.parseInt(queries[i].c);
                String str = (sb.substring(start,end+1)).toString();
                lexoSort(ans,str,kth);
            }
        }
        return ans;
    }
//	Sorting a string in O(n) time complexity.
	public static void lexoSort(ArrayList<Character> aa ,String s,int k)
	{
		int[] str = new int[26];
		for(char c : s.toCharArray())
			str[c-'a']++;
		int i=25;
		for(;i>=0 && k>0;i--)
			k-=str[i];
		aa.add((char)('b'+i));
	}
	public static void main(String[] args) 
	{
		String s = "abab";
		query queries[]=new query[2];
		queries[0]=new query("1","2","d",null);
		queries[1]=new query("2","1","3","1");
		System.out.println(easyTask(s.length(),s,queries.length,queries));
	}
}