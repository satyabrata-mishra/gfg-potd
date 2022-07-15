package trial;
import java.util.Scanner;
class Node1
{
	int data;
	Node1 link;
}
public class Palindrome_linked_list
{
	static Node1 start=null;
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node1 a=new Node1();
		System.out.print("Enter the data:");
		a.data=sc.nextInt();
		a.link=null;
		start=a;
		System.out.print("Do you want to create more nodes?");
		char ch=sc.next().charAt(0);
		while(ch=='y'||ch=='Y')
		{
			Node1 b=new Node1();
			System.out.print("Enter the data:");
			b.data=sc.nextInt();
			b.link=null;
			a.link=b;
			a=b;
			System.out.print("Do you want to create more nodes?");
			ch=sc.next().charAt(0);
		}
	}
	public static void rev()
	{
		Node1 temp=start;
		Node1 s=new Node1();
		Node1 q=new Node1();
		Node1 r=new Node1();
		s=start;
		r=null;
		while(s!=null)
		{
			q=s.link;
			s.link=r;
			r=s;
			s=q;
		}
		start=r;
		Node1 temp2=start;
		int x=0;
		while(temp!=null && temp2!=null)
		{
			if(temp.data!=temp2.data)
			{
				x=1;
				break;
			}
			temp=temp.link;
			temp2=temp2.link;
		}
		if (x==0)
			System.out.println("Palindrome Linked List");
		else
			System.out.println("Not A Palindrome Linked List");
	}
	public static void main(String[] args)
	{
		create();
		rev();
	}
}
