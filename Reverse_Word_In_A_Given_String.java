package cp;

public class Reverse_Word_In_A_Given_String
{
	public static String reverseWords(String S)
    {
		String ch[]=S.split("\\.");
		int temp=ch.length-1;
		for (int i=0;i<ch.length/2;i++,temp--)
		{
			String tempstr=ch[i];
			ch[i]=ch[temp];
			ch[temp]=tempstr;
		}
		String finalstr="";
		for(int i=0;i<ch.length-1;i++)
			finalstr+= ch[i]+".";
		finalstr+=ch[ch.length-1];
		return finalstr;
    }
	public static void main(String[] args)
	{
		System.out.println(reverseWords("i.like.this.program.very.much"));
//		Output-much.very.program.this.like.i
	}

}
