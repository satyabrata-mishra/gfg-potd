package cp;
public class Copy_Set_Bits_in_Range 
{
	public static int setSetBit(int x, int y, int l, int r)
    {
		for(int i=l-1; i<r; i++){
            int bit = (y >> i) & 1;
            x |= bit << i;
        }
        return x;
    }
	public static void main(String[] args) 
	{
		System.out.println(setSetBit(44,3,1,5));
	}
}