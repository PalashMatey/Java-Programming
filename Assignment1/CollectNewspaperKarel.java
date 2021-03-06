/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	
	public void run()
	{
		collectNewPaper();
		returnToStart();
	}
	// You fill in this part
	private void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	private void turnAround()
	{
		turnLeft();
		turnLeft();
	}
	
	private void collectNewPaper()
	{
		while(frontIsClear())
		{
			move();
		}
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
	}
	
	private void returnToStart()
	{
		turnAround();
		move();
		turnRight();
		
		while(frontIsClear())
		{
			move();
		}
		turnLeft();
		while(frontIsClear())
		{
			move();
			
		}
		turnAround();
	}
}
