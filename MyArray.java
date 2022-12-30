package dataStructures;

public class MyArray
{
	
//		int value;
//		int index;
		int[] arr;
		static final int size=5;
		
		public MyArray()
		{
			this(size);
		}
		
		public MyArray(int size)
		{
			this.arr=new int[size];
		}
		
		public int insert(int val) 
		{
			for(int i=0;i<arr.length;i++)
			{
				if( arr[0]==0 && arr[0]>0) 
				{
					arr[0]=val;
					return val;
				}else {
					
					if(i==arr.length-1) {
						return val;
					}else {
						{
							arr[i+1]=val;
						}
					}
					
				}
		}
			return val;
		}
		
		
		
		public void display()
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		public static void main(String args[])
		{
			MyArray a=new MyArray();
			
			a.insert(71);
			a.insert(1);
			a.insert(271);
			a.insert(371);
			a.insert(971);
			a.display();
		}

	}


