package battle;

import java.util.Scanner;
/**
 * HumanPlayer class extended from base abstract class Player
 *
 */
public class HumanPlayer extends Player{
	private MovesList humanList;
	//public movesArray humanArray;
	
	public HumanPlayer(Monster monster) {
		this.monster=monster;
		//humanArray=new movesArray();
		humanList=new MovesList();
	}
	/**
	 * This class allows the user to select moves via console input 
	 * In order for the user to input via console, we have to return 'scan.nextint();' since the move will be selected as a number/integer
	 */
	public int chooseMove() {
		Scanner scan= new Scanner(System.in);
		int filter;
		System.out.println("Choose your menu filter\n(0)-default\n(1)-power\n(2)-accuracy");
		filter=scan.nextInt();
		for(int i=0;i<4;i++){
			humanList.insert(this.monster.getMovesArray()[i], filter);
		}
		humanList.print();
		humanList.resetList();
		return scan.nextInt();
	}
}
