import java.util.*;
public class snakeandladdergame {

	public static void main(String[] args) {
		System.out.println("Welcome to snake ladder game");
		final	int NUMBER_OF_PLAYER=1;
		final	int NO_PLAY=1;
	    final	int LADDER=2;
	    final	int SNAKE=3;
	    int START_POSITION=0;
	    
	    int position=START_POSITION;
        Random random = new Random();
        
		 //ROLL DIE FOR PLAYER
		 int rollDie= random.nextInt(6);
		 
		 //CHECK FOR OPTION
		 int checkOption=random.nextInt(3);
		 
		 switch(checkOption) {
		 
		 case 0:{
			 System.out.println("No Play: ");
             System.out.println("Die face value: " + rollDie);
			 
		 }
		 case 1:{
			 System.out.println("Ladder: ");
             System.out.println("Die face value: " + rollDie);
             if(START_POSITION < 100){
                 int currentPosition = START_POSITION + rollDie;
                 if(currentPosition <= 100){
                	 START_POSITION = currentPosition;
                	 
                 }
             }
		  }
		 case 3 :{
             System.out.println("Snake: ");
             System.out.println("Die face value: " + rollDie);
             
             if(START_POSITION > 0){
                 int currentPosition = START_POSITION - rollDie;
                 if(currentPosition >= 0){
                	 START_POSITION = currentPosition;
                 }
             else
                 System.out.println("You can't go down any further.");
             }
         }
		 
		}
	}

}		 
