/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
	public void run()
	{
		fillLine();
		moveBack();
		getMidPoint();
	}
	
	private void fillLine()
	{
		putBeeper();
		while(frontIsClear())
		{
			move();
			putBeeper();
		}
		turnAround();
	}
	private void moveBack()
	{
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}
	
	private void moveToLastBeeperAhead()
	{
		while(frontIsClear() && beepersPresent())
		{
			move();
		}
		if (noBeepersPresent())
		{
			turnAround();
			move();
			turnAround();
		}
		

	}
	
	private void getMidPoint()
	{
		while(beepersPresent())
		{
			moveToLastBeeperAhead();
			pickBeeper();
			turnAround();
			if(frontIsClear())
			{
				move();
			}
		}
		
		turnAround();
		if (frontIsClear()) {
			move();
		}
		putBeeper();
	}

}
