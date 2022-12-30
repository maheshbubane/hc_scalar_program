package dataStructures;


import java.util.Scanner;

public class SwitchCases 
{
	public static void display() 
	{
		Scanner sc =new Scanner(System.in);
		String choice = null;
		
		do
		{
			System.out.println("**FOLLOWING ARE THE DATA STRUCTURES**");
			System.out.println("Press 1 for Stack DS");
			System.out.println("Press 2 for Queue DS");
			System.out.println("Press 3 for LinkedList DS");
			System.out.println("Press 4 for Array DS");
			System.out.println("Press 0 for Exit");
			int input = sc.nextInt();
			
			switch(input)
			{
			case 1:
				System.out.println("Methods in STACK");
			    MyStack myStack = new MyStack();
			
			do {
	
				System.out.println("Press 1 for push method");
				System.out.println("Press 2 for pop method");
				System.out.println("Press 3 for peek method");
				int a= sc.nextInt();
				
				switch(a)
				{
				case 1:
					System.out.println("Please enter the data");
					int ele=sc.nextInt();
					myStack.push(ele);
					break;
					
				case 2:
					System.out.println(myStack.pop());
					break;
					
				case 3:
					System.out.println(myStack.peek());
					break;
					
				case 4:
					myStack.display();
					
				default:
					System.out.println("Invalid Entry......Please Choose Right One!");
					
				
				}
				System.out.println("Do you use agian?? yes/no");
				choice=sc.next();
				
					
				
			  }
			  while (choice.equalsIgnoreCase("yes"));
			
			     break;
			     
			     
				
			case 2:
				System.out.println("Methods in QUEUE");
				MyQueue myQueue = new MyQueue();
				
				do 
				{
					System.out.println("Press 1 for insert");
					System.out.println("Press 2 for remove");
					System.out.println("Press 3 for front");
					int a=sc.nextInt();
					
					switch(a)
					{
					case 1:
						System.out.println("Please enter the data");
						int ele =sc.nextInt();
						myQueue.insert(ele);
						myQueue.display();
						break;
						
					case 2:
						System.out.println(myQueue.remove());
						break;
						
					case 3:
						System.out.println(myQueue.front());
						break;
						
					case 4:
						myQueue.display();
						
					default:
						System.out.println("Invalid Entry......Please Choose Right One!");
						
					}
					
					System.out.println("Do you use agian?? yes/no");
					choice=sc.next();
					
				} 
				while (choice.equalsIgnoreCase("yes"));
				
			     break;
				
				
			case 3:
				System.out.println("Methods in LinkedList");
				MyLinkedList myLinkedList = new MyLinkedList();
				
				do {
					System.out.println("Press 1 for Add Node at Head");
					System.out.println("Press 2 for Insert");
					System.out.println("Press 3 for Insert at Index");
					System.out.println("Press 4 for Display");
					System.out.println("Press 5 for Delete First");
					System.out.println("Press 6 for Delete Last");
					System.out.println("Press 7 for Delete At Index");
					int a=sc.nextInt();
					
					switch(a)
					{
					case 1:
						System.out.println("Please enter the data");
					    int ele=sc.nextInt();
					    myLinkedList.addNodeAtHead(ele);
					    break;
					    
					case 2:
						System.out.println("Please enter the data");
						int i =sc.nextInt();
						myLinkedList.insert(i);
						break;
						
					case 3:
						System.out.println("Please enter the data and Index");
						
						
					    
					
					}
					
				} 
				while (choice.equalsIgnoreCase("yes"));
				
			     break;
				
			case 4:System.out.println("Methods in Array");
				break;
				
			case 0: choice="n";
				break;
			
			default:
				System.out.println("Invalid Entry......Please Choose Right One!");
			}
			if (choice==null) 
			{
				System.out.println("Do you use agian?? yes/no");
				choice=sc.next();
			}
		}
		while(choice.equalsIgnoreCase("yes/no"));
		System.out.println("Exit Operations");
		}
	  
	 public static void main(String[] args) 
	 {
		//SwitchCases s = new SwitchCases();
		SwitchCases.display();
	 }

	
}
