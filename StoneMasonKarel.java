/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	
	public void run()
	{
		while (frontIsClear())
		{
			ascendColumn();
			descendColumn();
			moveNextColumn();
		}
		
	
	}
	
	private void ascendColumn()
	{
		isBeeperPresent();
		turnLeft();
		while(frontIsClear())
		{
			move();
			isBeeperPresent();
				
		}
	}
	
	private void descendColumn()
	{
		turnAround();
		while(frontIsClear())
		{
			move();
		}
		turnLeft();
	}
	
	private void isBeeperPresent()
	{
		if(noBeepersPresent())
		{
			putBeeper();
		}
	}
	
	private void moveNextColumn()
	{
		move();
		move();
		move();
		move();
	}
	
	// You fill in this part

}
