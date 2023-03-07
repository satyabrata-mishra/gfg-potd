package cp;
public class Too_Many_1_s 
{
	public static int noConseBits(int n) 
    {
		char ch[] = Integer.toBinaryString(n).toCharArray();
		for(int i=0;i<ch.length-2;i++)
			if(ch[i]=='1' && ch[i+1]=='1' && ch[i+2]=='1')
				ch[i+2]='0';
		return Integer.parseInt(new String(ch),2);
    }
	public static void main(String[] args) 
	{
		System.out.println(noConseBits(2));
	}

}
