package datastructureproject.singlelinkedlist;

public class LinkedList1 {
	//참고-https://wookyungjin.tistory.com/9
	//field
	private ListNode head;
	
	//constructor
	public LinkedList1() {
		head = null;
	}
	
	//method
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		
		
	}
	
	public void insertLastNode(String data) {
		//원리 파악 중
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
//			newNode.link = head;
			head = newNode;
		}else {
			ListNode temp = head;
			
			while(temp.link != null) {
				temp = temp.link;
			}
			
			temp.link = newNode;
		}
		
	}
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(",");
			}
		}
		System.out.println(")");
	}	
	
	public void deleteLastNode() {
		ListNode pre, temp;
		
		
		
	}
	
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		
		
		
		
		return temp;
	}
	
	public void reverseList() {
		ListNode newt = head;
		ListNode current = null;
		ListNode pre = null;
		
		
		
		head = current;
	}
	
}