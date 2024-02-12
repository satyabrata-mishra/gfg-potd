package cp;
import java.util.*;
public class Course_Schedule 
{
	static void dfs(int node,boolean visited[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> stack)
	{
		visited[node]=true;
		for(int i:adj.get(node))
			if(!visited[i])
				dfs(i,visited,adj,stack);
		stack.add(node);
	}
	static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<Integer>());
		for(ArrayList<Integer> i:prerequisites)
			adj.get(i.get(1)).add(i.get(0));
		Stack<Integer> stack=new Stack<Integer>();
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++)
			if(!visited[i])
				dfs(i,visited,adj,stack);
		int ans[]=new int[n];
		int i=0;
		while(!stack.isEmpty())
			ans[i++]=stack.pop();
		return ans;
    }
	public static void main(String[] args)
	{
		int n = 4;
		int prerequisites[][] = {{1, 0},{2, 0},{3, 1},{3, 2}};
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		for(int i[]:prerequisites)
			list.add(new ArrayList<>(Arrays.asList(i[0],i[1])));
		int ans[]=findOrder(n,prerequisites.length,list);
		for(int i:ans)
			System.out.print(i+" ");
	}
}