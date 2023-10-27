package cp;
import java.util.*;
public class Rotate_Bits 
{
	ArrayList<Integer> rotate(int N, int D)
    {
		D = D%16;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int left = (((N << D) | (N >> (16 - D))) & 0xFFFF);
        int right = (((N >> D) | (N << (16 - D))) & 0xFFFF);
        ans.add(left);
        ans.add(right);
        return ans;
    }
	public static void main(String[] args) 
	{
		Rotate_Bits ob = new Rotate_Bits();
		System.out.println(ob.rotate(28,2));
		System.out.println(ob.rotate(29,2));
	}
}