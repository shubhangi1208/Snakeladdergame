import java.util.*;

public class snakeandladdergame {
    public static void main(String[] args) {
        numberOfPlayers();
    }

//    function to initialize the number of players
    static void numberOfPlayers(){
//        setting the player's start position to 0
        int playerOnePosition = 0;
        playGame(playerOnePosition);
    }

//    function to play the game
    static void playGame(int playerOnePosition){
        Random random = new Random();
        int dieRollCount = 0;
        System.out.println("Player One's current position: " + playerOnePosition);
        while (playerOnePosition != 100){
            int dieRoll = random.nextInt(1, 7);
            dieRollCount++;
            playerOnePosition = playAvailableOptions(playerOnePosition, dieRoll);
            System.out.println("Player One's current position: " + playerOnePosition);
            System.out.println();
        }
        System.out.println("Congratulations! You completed the game successfully.");
        System.out.println("The die was rolled " + dieRollCount + " number of times to win the game.");
    }

//        function to play available options
    static int playAvailableOptions(int playerOnePosition, int dieRoll){
        Random random = new Random();
        int availableOptions = random.nextInt(1, 4);
        switch(availableOptions){
            case 1 -> {
                System.out.println("No Play: ");
                System.out.println("Die face value: " + dieRoll);
            }
            case 2 -> {
                System.out.println("Ladder: ");
                System.out.println("Die face value: " + dieRoll);
                if(playerOnePosition < 100){
                    int currentPosition = playerOnePosition + dieRoll;
                    if(currentPosition <= 100){
                        playerOnePosition = currentPosition;
                    }
                    else{
                        System.out.println("You need to get the exact die face value to reach near or exactly 100 and not more than that ");
                    }
                }
            }
            case 3 -> {
                System.out.println("Snake: ");
                System.out.println("Die face value: " + dieRoll);
                if(playerOnePosition > 0){
                    int currentPosition = playerOnePosition - dieRoll;
                    if(currentPosition >= 0){
                        playerOnePosition = currentPosition;
                    }
                else{
                    System.out.println("You can't go down any further.");
                }
                }
            }
        }
        return playerOnePosition;
    }
}