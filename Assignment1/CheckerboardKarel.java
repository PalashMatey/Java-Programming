/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run()
	{
		while(frontIsClear())
		{
			fillLine();
			endOfLineCheck();
		}
	}
	
	private void fillLine()
	{
		while(frontIsClear())
		{
			move();
			if(frontIsClear())
			{
				putBeeper();
				move();
			}
		}
	}
	
	public void endOfLineCheck()
	{
		if(facingEast())
		{
			putBeeper();
			turnLeft();
			if(frontIsClear())
			{
				move();
				turnLeft();
			}
		}
		else
		{
			putBeeper();
			turnRight();
			if(frontIsClear())
			{
				move();
				turnRight();
			}
		}
		
	}
	
}
