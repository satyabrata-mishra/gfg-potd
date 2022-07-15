package trial;

import java.util.Scanner;

class Node
{
	int info;
	Node link;
}
public class Separating_even_and_odd_numbers_from_a_linked_list
{
	static Node start=null;
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node a=new Node();
		System.out.println("Enter a no: ");
		a.info=sc.nextInt();
		a.link=null;
		start=a;
		System.out.println("Want to create more nodes?(Yes-y//No-n)");
		char ch=sc.next().charAt(0);
		while(ch=='y' || ch=='Y')
		{
			Node b=new Node();
			System.out.println("Enter a no: ");
			b.info=sc.nextInt();
			b.link=null;
			a.link=b;
			a=b;
			System.out.println("Want to create more nodes?(Yes-y//No-n)");
			ch=sc.next().charAt(0);
		}
	}
	public static void display()
	{
		Node q=start;
		while(q!=null)
		{
			System.out.print(q.info+" ");
			q=q.link;
		}
		System.out.println();
	}
	public static void required()
	{
		Node q=start;
		while(q!=null)
		{
			if (q.info%2==0)
				System.out.print(q.info+" ");
			q=q.link;
		}
		q=start;
		while(q!=null)
		{
			if (q.info%2!=0)
				System.out.print(q.info+" ");
			q=q.link;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Create The Linked List.");
			System.out.println("2.Display The Linked List.");
			System.out.println("3.Get The Required Output.");
			System.out.println("4.Exit.");
			int a=sc.nextInt();
			switch(a)
			{
			case 1:create();break;
			case 2:display();break;
			case 3:required();break;
			case 4:System.exit(0);break;
			default :System.out.println("Invalid Input");
			}
		}
	}

}
