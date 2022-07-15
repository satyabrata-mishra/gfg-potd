package cp;

public class Find_An_Replace_In_String
{
	static String findAndReplace1(String s, int q, int[] index, String[] sources, String[] targets) 
	{
	       int temp=0;
	       for(int i=0;i<q;i++)
	       {
	           int l=index[i]+temp;
	           String s1=s.substring(0,l);
	           String s2=s.substring(l);
	           if((s.substring(l,l+sources[i].length())).equals(sources[i]))
	           {
	        	   s2=s2.replaceFirst(sources[i],targets[i]);
	               temp+=targets[i].length()-sources[i].length();
	           }
	           System.out.println(s1);
	           System.out.println(s2);
	       }
	       return s;
	   }
	public static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) 
	{
        // code here
		for(int i=0;i<Q;i++)
		{
			int left=index[i], right= sources[i].length()+left;
			String substr1 = S.substring(left , right);
			String substr2 = S.substring(right);
			System.out.println(substr1);
			if(substr1.equals(sources[i]))
			{
				substr1= substr1.replace(sources[i], targets[i]);
			}
//			S=substr1+substr2;
		}
		return S;
    }
	public static void main(String[] args)
	{
		String s = "gforks";
		int q=2;
		int index[] = {0, 4};
		String sources[] = {"g", "ks"};
		String targets[] = {"geeks", "geeks"};
		System.out.println(findAndReplace(s,q,index,sources,targets));
	}
}
