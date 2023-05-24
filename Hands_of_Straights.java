package cp;
import java.util.*;
public class Hands_of_Straights 
{
	public static boolean isStraightHand(int N, int groupSize, int hand[]) 
    {
		if (N % groupSize != 0) 
			return false;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int num : hand) 
            treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
        while (!treeMap.isEmpty()) 
        {
            int first = treeMap.firstKey();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < groupSize; j++) 
            {
                int next = first + j;
                if (treeMap.containsKey(next)) 
                {
                	temp.add(next);
                    treeMap.put(next, treeMap.get(next) - 1);
                    if (treeMap.get(next) == 0) 
                    	treeMap.remove(next);
                } 
                else
                    return false;
            }
            l.add(temp);
        }
        System.out.println(l);
        return true;
    }
	public static void main(String[] args) 
	{
		int hand[] = {1, 2, 3, 6, 2, 3, 4, 7, 8};
		int groupSize=3;
		System.out.println(isStraightHand(hand.length,groupSize,hand));
	}
}