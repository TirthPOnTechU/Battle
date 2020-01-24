package battle;

public class movesArray {
	Move[] moveList;
	int size;
	
	public movesArray() {
		moveList=new Move[4];
		size=0;
	}
	
	public void addBack(Move move, int filter) {
		if (size==0){
			moveList[size]=move;
			size++;
			return;
		}
		
		int position=size;
		switch(filter) {
		case 0:
			break;
		
		case 1:
			while((move.getPower()>=moveList[position-1].getPower())&&position>0) {
				moveList[position]=moveList[position-1];
				position--;
			}
			break;
		case 2:
			while(move.getAccuracy()>=moveList[position-1].getAccuracy()&&position>0) {
				moveList[position]=moveList[position-1];
				position--;
			}
			break;
			
		}	
		moveList[position]=move;
		size++;
	}
	
	public void print() {
		System.out.println("MOVE LIST:");
		for(int i=0;i<4;i++) {
			System.out.println(moveList[i].print());
		}
	}
	
	public void sort() {
		
	}
}
