package cp;
import java.util.*;
public class Find_Number 
{
//	Brute force
	public static long findNumber1(long N)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("9");
        long i = 4,j=0;
        while(i<N)
        {
        	list.add(list.get((int)j)+"1");
        	list.add(list.get((int)j)+"3");
        	list.add(list.get((int)j)+"5");
        	list.add(list.get((int)j)+"7");
        	list.add(list.get((int)j)+"9");
        	j+=1;
        	i+=5;
        }
//        System.out.println(list);
        return Long.parseLong(list.get((int)(N-1)));
    }
//	Optimized
	public static long findNumber(long N)
    {
		String ans = "";
        int val[]={9,1,3,5,7};
        while(N>0)
        {
            ans=val[(int)(N%5)]+ans;
            if(N%5==0)
                N=(N/5)-1;
            else
                N/=5;
        }
        return Long.parseLong(ans);
    }
	public static void main(String[] args) 
	{
		System.out.println(findNumber1(13));
	}
}