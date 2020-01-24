package battle;

import java.util.Random;

/**
 * 
 * CPUPlayer class is extended from base abstract class Player 
 */
public class CPUPlayer extends Player {
	/**
	 * @param monster This constructs Monster for CPU Player
	 */
	public CPUPlayer(Monster monster) {
		this.monster=monster;
	}
	
	/**
	 * This generates a random number to choose a move for CPU player
	 */
	public int chooseMove() {
		Random rnd= new Random();
		return (1+rnd.nextInt(4));
	}
}
