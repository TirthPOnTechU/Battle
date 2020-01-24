package battle;

public class MovesList {
	Node head;
	Node tail;
	int size;
	public MovesList() 
	{
		head= new Node(null, null,null);
		tail= new Node(null, null,null);
		head.next=tail;
		size=0;
	}
	
	public boolean isEmpty() 
	{
		return head.next==tail;
	}
	
	public void insert(Move move, int filter) 
	{
		if (isEmpty()) {
			Node newMove=new Node(move, tail, head);
			head.next=newMove;
			tail.prev=newMove;
			size++;
		}
		else {
			Node newMove=new Node(move, null, null);
			Node current=head.next;
			switch(filter) {
			case 0:
				break;
			case 1:
				while (move.getPower() <= current.move.getPower()) {
						current=current.next;
						if(current==tail) {
							break;
						}
				}
				break;
			case 2:
				while (move.getAccuracy() <= current.move.getAccuracy()) {
						current=current.next;
						if(current==tail) {
							break;
						}
				}
				break;
			}
			newMove.next=current;
			newMove.prev=current.prev;
			current.prev.next=newMove;
			current.prev=newMove;
			size++;
		}
			
	}
	

	public void resetList() {
		head.next=tail;
		tail.prev=head;
		size=0;
	}
	
	
	public void print() {
		Node current=head.next;
		System.out.println("CHOOSE MOVE:");
		while (current!=tail) {
			System.out.println(current.move.print());
			current=current.next;
		}
	}

}
