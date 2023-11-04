package cp;
public class Check_whether_K_th_bit_is_set_or_not 
{
	static boolean checkKthBit(int n, int k)
    {
		return (n>>k&1)==1?true:false;
    }
	public static void main(String[] args) 
	{
		System.out.println(checkKthBit(4,0));
		System.out.println(checkKthBit(4,2));
	}
}