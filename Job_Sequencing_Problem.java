package cp;
import java.util.*;
class Job
{
	int id,deadline,profit;
	Job(int x,int y,int z)
	{
		id=x;
		deadline=y;
		profit=z;
	}
}

public class Job_Sequencing_Problem 
{
	public static int[] JobScheduling(Job arr[], int n)
    {
		Arrays.sort(arr,(a,b)->a.deadline-b.deadline);
		PriorityQueue<Job> pq = new PriorityQueue<>((a, b)-> b.profit-a.profit);
        int count = 0, sum = 0;
        for(int i=n-1; i>=0; i--) 
        {   
            int slot = 0;
            if(i == 0) 
            	slot = arr[i].deadline;
            else 
            	slot = arr[i].deadline-arr[i-1].deadline;
            pq.add(arr[i]);
            while(slot>0 && pq.size()>0) 
            {
                Job job = pq.poll();
                count++;
                sum+=job.profit;
                slot--;
            }
        }
        return new int[]{count, sum};
    }
	public static void main(String[] args) 
	{
		Job[] jobs = new Job[4];
		jobs[0].id=1;jobs[0].deadline=4;jobs[0].profit=20;
		jobs[1].id=2;jobs[1].deadline=1;jobs[1].profit=10;
		jobs[2].id=3;jobs[2].deadline=1;jobs[2].profit=40;
		jobs[3].id=4;jobs[3].deadline=1;jobs[3].profit=30;
		int arr[]=JobScheduling(jobs,jobs.length);
		for(int i:arr)
			System.out.println(i+" ");
	}

}
