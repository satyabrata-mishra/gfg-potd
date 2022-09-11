package cp;

public class Rabin_Karp_Algorithm_for_Pattern_Searching 
{
	static void search(String pat, String txt)
    {
		int patlen = pat.length();
		int txtlen = txt.length();
		int i = 0;
		while(patlen<=txtlen)
			if(txt.substring(i++,patlen++).equals(pat))
				System.out.print((i-1)+" ");
    }
	public static void main(String[] args) 
	{
		search("TEST","THIS IS A TEST TEXT");
	}

}
