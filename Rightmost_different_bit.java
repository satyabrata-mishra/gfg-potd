package cp;
public class Rightmost_different_bit 
{
	public static int posOfRightMostDiffBit(int m, int n)
    {
		String m_bin=Integer.toBinaryString(m),n_bin=Integer.toBinaryString(n);
		while(m_bin.length()!=n_bin.length())
		{
			if(m_bin.length()>n_bin.length())
				n_bin="0"+n_bin;
			else
				m_bin="0"+m_bin;				
		}
		for(int i=m_bin.length()-1;i>=0;i--)
			if(m_bin.charAt(i)!=n_bin.charAt(i))
				return m_bin.length()-i;
		return -1;	
    }
	public static void main(String[] args) 
	{
		System.out.println(posOfRightMostDiffBit(52,4)); 
		System.out.println(posOfRightMostDiffBit(4,4));
	}
}