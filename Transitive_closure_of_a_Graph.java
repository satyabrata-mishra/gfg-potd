package cp;
import java.util.*;
public class Transitive_closure_of_a_Graph 
{
	static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
	{
        // code here
		 for(int k=0;k<N;k++) 
		 {
	            for(int i=0;i<N;i++) 
	            {
	                for(int j=0;j<N;j++) 
	                {
	                    if(i==j) 
	                    	graph[i][j] = 1;
	                    if(graph[i][j]==0) 
	                        if(graph[i][k]==1 && graph[k][j]==1) 
	                        	graph[i][j]=1;
	                }
	            }
		 }
		 ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		 for(int i=0;i<N;i++)
		 {
			 ArrayList<Integer> temp=new ArrayList<Integer>();
			 for(int j=0;j<N;j++)
				 temp.add(graph[i][j]);
			 ans.add(temp);
		 }
		 return ans;
    }
	public static void main(String[] args) 
	{
		int graph[][] ={{1, 1, 0, 1}, 
		         		{0, 1, 1, 0}, 
		         		{0, 0, 1, 1}, 
		         		{0, 0, 0, 1}};
		ArrayList<ArrayList<Integer>> ans = transitiveClosure(graph.length, graph);
		for(ArrayList<Integer> i:ans)
			System.out.println(i);
	}
}