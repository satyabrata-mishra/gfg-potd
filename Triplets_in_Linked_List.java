package trial;
import java.util.Scanner;
public class Triplets_in_Linked_List
{
	static Node start=null;
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node a=new Node();
		System.out.print("Enter info ");
		a.info=sc.nextInt();
		a.link=null;
		start=a;
		System.out.print("Want to create more nodes? (Yes-y) ");
		char ch=sc.next().charAt(0);
		while(ch=='y'||ch=='Y')
		{
			Node b=new Node();
			System.out.print("Enter info ");
			b.info=sc.nextInt();
			b.link=null;
			a.link=b;
			a=b;
			System.out.print("Want to create more nodes? (Yes-y) ");
			ch=sc.next().charAt(0);
		}
	}
	public static void triplets()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sum ");
		int sum=sc.nextInt();
		Node p=start;
		while (p!=null)
		{
			Node q=start;
			while(q!=null)
			{
				Node r=start;
				while (r!=null)
				{
					if (p.info+q.info+r.info==sum && p.info!=q.info && q.info!=r.info)
					{
						System.out.println(p.info+" "+q.info+" "+r.info);
					}
					r=r.link;
				}
				q=q.link;
			}
			p=p.link;
		}
		System.out.println("Loop Ended");
	}
	public static void display()
	{
		Node q=start;
		while (q!=null)
		{
			System.out.print(q.info+" ");
			q=q.link;
		}
	}
	public static void main(String[] args)
	{
		create();
//		display();
		triplets();
	}

}
