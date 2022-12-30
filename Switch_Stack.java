//package dataStructures;
//
//import java.util.Scanner;
//
//public class Switch_Stack
//{
//	public static void stack_methods() 
//	{
//		MyStack myStack = new MyStack();
//		Scanner sc = new Scanner(System.in);
//		String choice= null;
//		int input;
//		do {
//			System.out.println("Methods In Stack As Follows");
//			System.out.println("Press 1 for PUSH method");
//			System.out.println("Press 2 for POP method");
//			System.out.println("Press 3 for PEEK method");
//			System.out.println("Press 0 for Exit");
//			
//			
//			input= sc.nextInt();
//			switch(input)
//			{
//			case 1:
//				System.out.println("How many values you want to insert in the STACK");
//				int n = sc.nextInt();
//				System.out.println("Enter any "+n+" values");
//				 for (int i = 0; i < n; i++)
//				 {
//					myStack.push(sc.nextInt());
//				 }
//				 System.out.println("Your STACK have following data  ");
//				 myStack.display();
//				break;
//				
//			case 2:
//				break;
//				
//			case 3:
//				break;
//				
//			case 0:
//				break;
//				
//			}
//			
//		} while (choice.equalsIgnoreCase("y"));
//			System.out.println("Thanks for using STACK");
//		
//		
//	}
//	public static void main(String[] args) {
//		Switch_Stack.stack_methods();
//	}
//
//}
