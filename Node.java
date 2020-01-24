package battle;

public class Node {
	Move move;
	Node next;
	Node prev;
	
	public Node(Move move,Node next, Node prev) {
		this.move=move;
		this.next=next;
		this.prev=prev;
	}
}
