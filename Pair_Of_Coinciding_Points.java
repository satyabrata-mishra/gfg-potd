package cp;
import java.util.*;
public class Pair_Of_Coinciding_Points 
{
	public static int numOfPairs(int[] X, int[] Y, int N)
	{
		Map<Integer, Integer> xCount = new HashMap<>();
        Map<Integer, Integer> yCount = new HashMap<>();
        Map<ArrayList<Integer>, Integer> visited = new HashMap<>();
        int cnt1=0, cnt2=0, cnt3=0;
        for(int i=0;i<N;i++){
            cnt1+=xCount.getOrDefault(X[i], 0);
            xCount.put(X[i], xCount.getOrDefault(X[i],0)+1);
            
            cnt2+=yCount.getOrDefault(Y[i], 0);
            yCount.put(Y[i], yCount.getOrDefault(Y[i], 0)+1);
            
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(X[i], Y[i]));
            cnt3+=visited.getOrDefault(list, 0);
            visited.put(list, visited.getOrDefault(list, 0)+1);
        }
        return cnt1+cnt2-(2*cnt3);
    }
	public static void main(String[] args) 
	{
		int x[]= {1, 2, 1};
		int y[]= {2, 3, 3};
		System.out.println(numOfPairs(x,y,x.length));
	}

}
