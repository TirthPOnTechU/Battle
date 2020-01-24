package battle;
import java.util.Random;

/**
 * 
 * Player Class declared as abstract as it has no constructor
 */
abstract class Player {
	protected Monster monster;
	
	/**
	 * 
	 * @return Returns True when Monster health is less then or equal to zero. False otherwise
	 */
	public boolean hasLost() {
		if (getMonster().getHP()<=0) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return Returns monster after using Monster class as a reference data type
	 */
	public Monster getMonster() {
		return monster;
	}
	
	/**
	 * 
	 * @param opponent represents the monster of the opponent 
	 * @return Returns True if monster speed stats are eqaual or faster than the opponent monster. False otherwise
	 */
	public boolean isFasterThan(Player opponent) {
		if (monster.getSpeed()>=opponent.monster.getSpeed()) {
			//System.out.println(monster.getName()+" IS FASTER THAN "+opponent.monster.getName());//REMOVE
			return true;
		}
		//System.out.println(monster.getName()+" IS NNNNOOOOTTTT FASTER THAN "+opponent.monster.getName());//REMOVE
		return false;
	}
	/**
	 * This gives an option to choose one of the four moves
	 * Prints out the message displaying the move
	 * It also updates the total damage dealt from that certain move
	 * @param opponent represents the opponent monster and their stats
	 * @param move represents the moves that can be selected by the user 
	 */
	public void attack(Player opponent, int move) {
		Move currentMove=null;
		int damageDealth=0;
		int newHP;
		switch (move) {
		case 1:
			currentMove=monster.getMove1();
			break;
		case 2:
			currentMove=monster.getMove2();
			break;
		case 3:
			currentMove=monster.getMove3();
			break;
		case 4:
			currentMove=monster.getMove4();
			break;
		}
		//System.out.println("------------------ THE MOVE THAT" +monster.getName()+"CHOSE IS"+currentMove.getName()+"-------------------");//REMOVE
		Random rnd=new Random();
		float attempt=rnd.nextFloat();
		//System.out.println("------------------ ATTEMPT FLOAT IS "+attempt+"-------------------");//REMOVE
		if (attempt>currentMove.getAccuracy()) {
			return;
		}
		else {
			damageDealth=monster.getAttack()+currentMove.getPower()-opponent.monster.getDefense();
			newHP=opponent.monster.getHP()-damageDealth;
			opponent.monster.setHP(newHP);
		}
	}
	
	abstract int chooseMove();
	
}
