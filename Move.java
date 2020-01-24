package battle;

/**
 * 
 * Class Move is used to declare Private variables 
 *
 */
public class Move {
	private String name;
	private String type;
	private int power;
	private float accuracy;
	private int moveNum=0;
	
	/**\
	 * 
	 * @param name This allows the user to see the name of move
	 * @param type This allows the user to see the type of move
	 * @param power This shows the power of a certain move since there are 4 different moves
	 * @param accuracy This shows how accurate the move is by showing the hit percentage of the move
	 */
	public Move(String name, String type, int power, float accuracy) {
		this.name=name;
		this.type=type;
		this.power=power;
		this.accuracy=accuracy;
	}
	/**
	 * 
	 * @return Returns the power of the move 
	 */
	public int getPower() {
		return power;
	}
	/**
	 * 
	 * @return Returns the hit percentage of the move showing the accuracy (between 0.0-1.0)
	 */
	public float getAccuracy() {
		return accuracy;
	}
	/**
	 * 
	 * @return Returns the name of the move 
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return Returns the type of move for the user 
	 */
	public String getType() {
		return type;
	}

	public int getMoveNum() {
		return moveNum;
	}
	public void setMoveNum(int num) {
		moveNum=num;
	}
	/**
	 * This class is used to display all the information together; Name, type, Power, and the Accuracy of the move
	 * @return returns a print statement 
	 */
	public String print() {
		return ("("+getMoveNum()+")"+"--Name:"+getName()+"--Type:"+getType()+"--Power:"+getPower()+"--Accuracy:"+getAccuracy());
	
	}
	
}
