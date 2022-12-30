package dataStructures;

public class MyStack 
{
		int[] stack;
		private static final int DEFAULT_SIZE=5;
		int top=-1;
		public MyStack() 
		{
			this(DEFAULT_SIZE);
		}
		
		public MyStack(int size)
		{
			this.stack=new int [size];
		}
		
		public boolean push(int value)
		{
			if(isFull())
			{
				int[] temp=new int[stack.length*2];
				for(int i=0;i<stack.length;i++)
				{
					temp[i]=stack[i];
				}
				stack=temp;
			}
			top++;
			stack[top]=value;
			return true;
		}
		
		public int pop()
		{
			if(isEmpty())
			{
				System.out.println("Stack is Empty");
			}
			return stack[top--];
		}
		
		public int peek()
		{
			if(isEmpty())
			{
				System.out.println("Stack is Empty");
			}
			return stack[top];
		}
		
		public boolean isFull()
		{
			return top==stack.length-1;
		}
		
		public boolean isEmpty()
		{
			return top==-1;
		}
		
		public void display()
		{
			for (int i = 0; i <=top; i++) 
			{
				System.out.print(stack[i]+" ");
			}
			System.out.println(" !");
		}
		
//		public static void main(String args[])
//		{
//			MyStack ms = new MyStack();
//
//			ms.push(10);
//			ms.push(11);
//			ms.push(15);
//			ms.push(25);
//			ms.push(44);
//			ms.push(12);
//			ms.push(9);
//			ms.push(22);
//			ms.display();
//			System.out.println("pop="+ms.pop());
//			ms.display();
//			
//		}

}


















