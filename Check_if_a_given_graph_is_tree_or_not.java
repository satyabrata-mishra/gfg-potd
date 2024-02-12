package cp;
import java.util.*;
public class Check_if_a_given_graph_is_tree_or_not 
{
	public static boolean detectCycle(int src,int parent,boolean[] visited,ArrayList<ArrayList<Integer>> edges)
	{
		visited[src]=true;
		for(int i:edges.get(src))
		{
			if(!visited[i])
			{
				visited[i]=true;
				if(detectCycle(i,src,visited, edges))
					return true;
			}
			else if(i!=parent)
				return true;
		}
		return false;
	}
	public static boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
		ArrayList<ArrayList<Integer>> adjList=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
			adjList.add(new ArrayList<>());
		for(ArrayList<Integer> i:edges)
		{
			adjList.get(i.get(0)).add(i.get(1));
			adjList.get(i.get(1)).add(i.get(0));
		}
		boolean visited[]=new boolean[n];
		int connected=0;
		for(int i=0;i<n;i++)
		{
			if(!visited[i])
			{
				connected++;
				if(detectCycle(i,-1,visited,adjList))
					return false;  
			}			
		}
		return connected==1;
    }
	public static void main(String[] args) 
	{
		int N = 4;
		int G[][] = {{0, 1}, {1, 2}, {2,0}};
		ArrayList<ArrayList<Integer>> edges=new ArrayList<ArrayList<Integer>>();
		for(int i[]:G)
			edges.add(new ArrayList<>(Arrays.asList(i[0],i[1])));
		System.out.println(isTree(N,G.length,edges));
	}
}