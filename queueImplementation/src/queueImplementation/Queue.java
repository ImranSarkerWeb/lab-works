package queueImplementation;
import java.util.Scanner;

public class Queue{
		int front;
		int rear;
		int n;
		int [] a;
		
		Queue(int size)
		{
			front=rear=-1;
			n=size;
			a= new int[n];
		}
		
		void enqueue(int i)
		{
			if (rear == n-1)
				System.out.println("Queue is full");
			else
				a[++rear]=i;
			if (front==-1)front++;
		}
		
		void dequeue()
		{
			if (front==n)
				System.out.println("Queue is Empty");
			else
				System.out.println(a[front++]+"");
		}
	


	public static void main(String[] args)  {

				Scanner myObj = new Scanner(System.in);
				int size=myObj.nextInt();
				
				Queue q=new Queue(size);
				for(int i=0; i<=size; i++)
				{
					q.enqueue(myObj.nextInt());
				}
				
				for(int i=0; i<=size; i++)
				{
					q.dequeue();
				}
				
				myObj.close();
			}
	}


