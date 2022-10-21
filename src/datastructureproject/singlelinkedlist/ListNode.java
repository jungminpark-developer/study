package datastructureproject.singlelinkedlist;

public class ListNode {
	//field
	private String data;
	public ListNode link;
	
	//constructor
	public ListNode() {
		this.data = null;
		this.link = null;
	}
	
	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}
	
	public ListNode(String data, ListNode link) {
		this.data = data;
	}
	
	//getter
	public String getData() {
		return data;
	}
}