package cp;

public class Implement_two_stacks_in_an_array
{
	int arr[];
    int size;
    int top1, top2;
    Implement_two_stacks_in_an_array()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
  //Function to push an integer into the stack1.
    void push1(int x)
    {
    	arr[++top1]=x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       arr[--top2]=x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        return top1==-1?-1:arr[top1--];
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        return top2==size?-1:arr[top2++];
    }
	public static void main(String[] args) 
	{
		String ans="";
		Implement_two_stacks_in_an_array ob = new Implement_two_stacks_in_an_array();
		ob.push1(2);
		ob.push1(3);
		ob.push2(4);
		ans+=ob.pop1()+" ";
		ans+=ob.pop2()+" ";
		ans+=ob.pop2()+" ";
		System.out.println(ans);
	}
}