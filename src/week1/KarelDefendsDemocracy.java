package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
//Karel is going to clean the voting ballot.
//if the middle beeper is present it will move.
// it will check only if there is no middle beeper
	public void run() {
				 	  
		//Algorithm 
		//move
		//move
		//move
		//move
		//move
		//turnLeft(North)
		//PickBeeper
		//turnAround
		//move
		//checkSouth
		//move
		//turnRight(south)
	
		
for(int i=0; i<5; i++) {
	    move();
		cleanExtraBeepers();
	    move();
	    
  }  
}

	private void cleanExtraBeepers() {
		// TODO Auto-generated method stub
		if (noBeepersPresent()) {
			cleanBeepersSouth();
			cleanBeepersNorth();
		}
	}



	private void cleanBeepersSouth() {
		// TODO Auto-generated method stub
		turnRight();
		move();
		while(beepersPresent()) {
		pickBeeper();
		}
		turnAround();
		move();
		
	}

	private void cleanBeepersNorth() {
		// TODO Auto-generated method stub
			move();

		while(beepersPresent()) {
			
			pickBeeper();
			
		}
			turnAround();
			move();
			turnLeft();
		
		
	}
						
	
	}


		

