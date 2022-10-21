package datastructureproject.singlelinkedlist;

public class SingleLinkedList {

	public static void main(String[] args) {
		LinkedList1 L = new LinkedList1();
		System.out.println("(1)���� ����Ʈ�� ��� 3�� �����ϱ�");
		L.insertLastNode("1");
		L.insertLastNode("3");
		L.insertLastNode("7");
		L.printList();
		
		System.out.println("(2)3 ��� �ڿ� 5 ��� �����ϱ�");
		ListNode pre = L.searchNode("3");
		if(pre == null) {
			System.out.println("�˻�����>> ã�� �����Ͱ� �����ϴ�.");
		}else {
			L.insertMiddleNode(pre, "5");
			L.printList();
		}
		
		System.out.println("(3)����Ʈ�� ��带 �������� �ٲٱ�");
		L.reverseList();
		L.printList();
		
		System.out.println("(4)����Ʈ�� ������ ��� �����ϱ�");
		L.deleteLastNode();
		L.printList();
	}
}
