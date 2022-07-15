package cp;

import java.util.ArrayList;

public class Tower_Of_Hanoi
{
	public static void toi(int n,int src,int dest,int temp,ArrayList<Integer> a)
	{
		if(n==0)
			return;
		toi(n-1,src,temp,dest,a);
		a.add(src);
		a.add(temp);
		toi(n-1,dest,src,temp,a);
	}
	public static void main(String[] args)
	{
		ArrayList<Integer>al = new ArrayList<>();  
        toi( 3 , 1 , 2 , 3 , al );  
        System.out.println(al);
	}

}
