package cp;
import java.util.*;
public class Bus_Conductor 
{
	public static int findMoves(int n, int[] chairs, int[] passengers) 
	{
		Arrays.sort(chairs);
		Arrays.sort(passengers);
		int ans = 0;
		for(int i=0;i<n;i++) 
			ans+=Math.abs(chairs[i]-passengers[i]);
		return ans;
	}
	public static void main(String[] args) 
	{
		int chairs[] = {3,1,5}; 
		int passengers[] = {2,7,4};
		System.out.println(findMoves(chairs.length,chairs,passengers));
	}
}