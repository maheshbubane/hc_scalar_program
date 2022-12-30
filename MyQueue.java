package dataStructures;

public class MyQueue 
{
	

			int[] queue;
			private static final int DEFAULT_SIZE=5;
			
			public MyQueue()
			{
				this(DEFAULT_SIZE);
			}
			
			public MyQueue(int size) 
			{ 
				this.queue=new int[size];
			}
			
			int end=0;
			
			public boolean isFull()
			{
				return end==queue.length;
			}
			
			public boolean isEmpty() 
			{
				return end==0;
			}
			
			public boolean insert(int value) 
			{
				if(isFull())
				{
					int[] temp=new int[queue.length*2];
					for(int i=0;i<queue.length;i++)
					{
						temp[i]=queue[i];
					}
					queue=temp;
				}
				queue[end]=value;
				end++;
				return true;
			}
			
			public int remove() 
			{
				if(isEmpty())
				{
					System.out.println("Queue Is Empty..!");
				}
				int remove=queue[0];
				for(int i=1;i<=end;i++) 
				{
					queue[i-1]=queue[i];
				}
				end--;
				return remove;
			}
			
			public int front()
			{
				if(isEmpty())
				{
					System.out.println("Queue is Empty..!");
				}
				return queue[0];
			}
			
			public void display() 
			{
				for(int i=0;i<end;i++) 
				{
					System.out.print(queue[i]+" ");
				}
				System.out.println(" !");
			}
			
//			public static void main(String args[])
//			{
//				MyQueue mq = new MyQueue();
//				
//				mq.insert(12);
//				mq.insert(20);
//				mq.insert(-32);
//				mq.insert(23);
//				mq.display();
//				System.out.println(mq.front());
//				System.out.println(mq.remove());
//				mq.display();
//				
//				
//			}
			
}


