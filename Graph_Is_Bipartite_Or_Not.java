package cp;
import java.util.*;
public class Graph_Is_Bipartite_Or_Not
{
	public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here 
		int[] color = new int[V];
        Arrays.fill(color, -1);
        Queue<Integer> q = new LinkedList<>();
        boolean is_Bipratite = true;
        for(int i = 0; i < V; i++)
        {
            if(color[i] == -1)
            {
                q.add(i);
                color[i] = 0;
                while(!q.isEmpty())
                {
                    int u = q.poll();
                    for(Integer v : adj.get(u))
                    {
                        if(color[v] == -1)
                        {
                            color[v] = color[u] ^ 1;
                            q.add(v);
                        }
                        else 
                        	is_Bipratite = is_Bipratite & (color[u] != color[v]);
                    }

                }
            }
        }
        return is_Bipratite;
    }
	public static void main(String[] args)
	{
		
	}

}
