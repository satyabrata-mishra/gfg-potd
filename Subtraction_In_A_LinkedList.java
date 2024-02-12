package cp;
import java.util.*;
public class Subtraction_In_A_LinkedList 
{
	static ArrayList<Integer> removeLeadingZeros(ArrayList<Integer> l1,int n)
	{
		int i=0;
		for(;i<n;i++)
			if(l1.get(i)!=0)
				break;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(;i<n;i++)
			ans.add(l1.get(i));
		return ans;
	}
	static ArrayList<Integer> findLarge(ArrayList<Integer> l1,ArrayList<Integer> l2)
	{
		ArrayList<Integer> list1=l1,list2=l2;
		if(l1.size()<l2.size())
		{
			list1=l2;
			list2=l1;
		}
		else if(l1.size()>l2.size())
		{
			list1=l1;
			list2=l2;
		}
		else
		{
			int i=0,j=0;
			while(i<list1.size() && j<list2.size())
			{
				if(list1.get(i)>list2.get(j))
				{
					list1=l1;
					list2=l2;
					break;
				}
				else if(list1.get(i)<list2.get(j))
				{
					list1=l2;
					list2=l1;
					break;
				}
				i++;
				j++;
			}
		}
		return subtract(list1,list2);
	}
	static ArrayList<Integer> subtract(ArrayList<Integer> l1,ArrayList<Integer> l2)
	{
		int n1=l1.size(),n2=l2.size();
		Collections.reverse(l1);
		Collections.reverse(l2);
		int i=0,j=0,borrow=0,diff=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		while(i<n1)
		{
			diff = borrow + l1.get(i) - ((j<n2)?l2.get(j):0);
			if(diff < 0)
			{
                borrow = -1;
                diff = 10 + diff;
            }
			else 
                borrow = 0;
			ans.add(diff);
			if(i<n1)
				i++;
			if(j<n2)
				j++;
		}
		Collections.reverse(ans);
		return removeLeadingZeros(ans,ans.size());
	}
	static ArrayList<Integer> subLinkedList(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		//Code here
		list1=removeLeadingZeros(list1,list1.size());
		list2=removeLeadingZeros(list2,list2.size());
		int n1=list1.size(),n2=list2.size();
		if(n1==1 && list1.get(0)==0)
			return list2;
		if(n2==1 && list2.get(0)==0)
			return list1;
		return findLarge(list1,list2);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(1,0,0));
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(9,9));
		System.out.println(subLinkedList(list1, list2));
	}
}