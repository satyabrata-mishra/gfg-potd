package cp;
import java.util.*;
public class Print_leaf_nodes_from_preorder_traversal_of_BST 
{
	public static int[] leafNodes(int arr[], int N)
    {
		Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++) 
        {
            if(!st.isEmpty() && st.peek()<arr[i]) 
            {
                int add = st.pop();
                int count = 1;
                while(!st.isEmpty()&&st.peek()<arr[i]) 
                {
                    count++;
                    st.pop();
                }
                if(count>=2)
                	list.add(add);
            }
            st.add(arr[i]);
        }
        if(!st.isEmpty())
        	list.add(st.pop());
        int ret[] = new int[list.size()];
        for(int i=0;i<list.size();i++)
        	ret[i] = list.get(i);
        return ret;
    }
	public static void main(String[] args) 
	{
		int arr[] = {2,1};
		arr=leafNodes(arr,arr.length);
		for(int i:arr)
			System.out.print(i+" ");
	}

}