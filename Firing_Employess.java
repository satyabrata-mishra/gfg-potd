package cp;
import java.util.*;
public class Firing_Employess 
{
	static boolean isPrime(int x)
    {
        if(x<=1) 
        return false; 
        for(int i=2;i<=Math.sqrt(x);i++)
            if(x % i == 0) 
                return false;
        return true; 
    }
    static int firingEmployees(int arr[], int n)
    { 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int rootNode = 1;
        for(int i = 0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i<n;i++){
            if(arr[i]!=0){
                adj.get(arr[i]).add(i+1);
            }else{
                rootNode = i+1;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        int level = 0,cnt = 0;
        q.offer(rootNode);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- >0){
                int tmp = q.poll();
                if(isPrime(tmp+level) && tmp!=rootNode) cnt++;
                for(int i:adj.get(tmp)){
                    q.offer(i);
                }
            }
            level++;
        }
        return cnt;
    } 
	public static void main(String[] args) 
	{
		int arr[] = {0, 1, 1, 2};
		System.out.println(firingEmployees(arr,arr.length));
	}

}
