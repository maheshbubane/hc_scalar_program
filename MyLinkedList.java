package dataStructures;

public class MyLinkedList 
{
	

		public Node head;
		public Node tail;
		public int size;

		public MyLinkedList() {
			this.size = 0;
		}

		class Node {
			public int value;
			public Node next;

			public Node(int value) {
				this.value = value;
			}

			public Node(int value, Node node) {
				this.value = value;
				this.next = node;
			}
		}

		public void addNodeAtHead(int value) {
			Node node = new Node(value);
			node.next = head;
			head = node;
			if (tail == null) {
				tail = head;
			}
			size++;
		}

		public void insert(int value) {
			if (tail == null) {
				addNodeAtHead(value);
				return;
			}
			Node node = new Node(value);
			tail.next = node;
			tail = node;
			size++;
		}

		public void insertAtIndex(int value, int index) {
			if (head == null) {
				addNodeAtHead(value);
				return;
			}
			if (index == size) {
				insert(value);
				return;
			}
			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			Node node = new Node(value, temp.next);
			temp.next = node;
			size++;
		}

		public void disply() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.value + " ->");
				temp = temp.next;
			}
			System.out.println("END");
		}

		public int deleteFirst() {
			int val=head.value;
			head=head.next;
			if(head==null) {
				tail=null;
			}
			size--;
			return val;
		}
		
		public int deleteLast() {
			if(size<=1) {
				return deleteFirst();
			}
			Node secondLast=get(size-2);
			int val=tail.value;
			tail=secondLast;
			tail.next=null;
			return val;
		}
		
		public int deleteAtIndex(int index) {
			if(index==0) {
				return deleteFirst();
			}
			if(index==size-1) {
				deleteLast();
			}
			
			Node prev=get(index-1);
			int val=prev.next.value;
			prev.next=prev.next.next;
			return val;
		}
		public Node get(int index) {
			Node node=head;
			for(int i=0;i<index;i++) 
			{
				node=node.next;
			}
			return node;
		}
		
		
//		public static void main(String args[])
//		{
//			MyLinkedList list = new MyLinkedList();
//			list.insert(1);
//			list.insert(4);
//			list.insert(10);
//			list.insert(40);
//			list.insertAtIndex(35, 3);
//			list.disply();
//			System.out.println(list.deleteFirst());
//			list.disply();
//			list.deleteAtIndex(2);
//			list.disply();
//			System.out.println(list.deleteLast());
//			
//		}
	}


