 package battle;

 /**\
  * 
  * Class Monster made to declare the private variables
  */
public class Monster {
	private String name;
	private String type;
	private int hp;
	private int speed;
	private int attack;
	private int defense;
	private Move move1;
	private Move move2;
	private Move move3;
	private Move move4;
	private Move[] moveArray = new Move[4];
	/**
	 * 
	 * @param name Shows the name of Monster 
	 * @param type Represents the type of Monster
	 * @param hp Represents and shows the hitpoints (hp) of Monster
	 * @param speed Represents and shows speed stats for  Mons
	 * @param attack Represents the attack stats for  Monster
	 * @param defense Represents the defense stats for  Monster  
	 * @param move1 Represents the First move for  Monster
	 * @param move2 Represents the Second move for Monster
	 * @param move3 Represents the Third move for Monster
	 * @param move4 Represents the Fourth move for Monster
	 * DRY: Do not repeat yourself
	 */
	public Monster(String name, String type, int hp, int speed, int attack, int defense, Move move1, Move move2, Move move3, Move move4) {
		this.name=name;
		this.type=type;
		this.hp=hp;
		this.speed=speed;
		this.attack=attack;
		this.defense=defense;
		this.move1=move1;
		this.move2=move2;
		this.move3=move3;
		this.move4=move4;
		this.moveArray[0] = move1;
		this.moveArray[1] = move2;
		this.moveArray[2] = move3;
		this.moveArray[3] = move4;
		
		for(int i=0;i<4;i++) {
			moveArray[i].setMoveNum(i+1);
		}
	}
	/**
	 * 
	 * @return returns the hitpoints(hp) of the monster as an integer
	 */
	public int getHP() {
		return hp;
	}
	/** 
	 * @return Returns the name of the Monster as a string
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return Returns the speed stats of the monster as an integer
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * 
	 * @param hp sets the instance variable hp (hitpoints) for monster
	 */
	public void setHP(int hp) {
		this.hp=hp;
	}
	/**
	 * 
	 * @return Returns the first move of monster
	 */
	public Move getMove1() {
		return move1;
	}
	/**
	 * 
	 * @return Returns the Second move of monster
	 */
	public Move getMove2() {
		return move2;
	}
	/**
	 * 
	 * @return Returns the third move of monster
	 */
	public Move getMove3() {
		return move3;
	}
	/**
	 * 
	 * @return Returns the fourth move of monster
	 */
	public Move getMove4() {
		return move4;
	}
	/**
	 * 
	 * @return Returns the attack stats for monster 
	 */
	public int getAttack() {
		return attack;
	}
	/**
	 * 
	 * @return Returns defense stats for monster
	 */
	public int getDefense() {
		return defense;
	}
	
	public Move[] getMovesArray() {
		return moveArray;
	}
}
