import java.util.*;

public class rps{
    static int playerScore = 0;
    static int computerScore = 0;
    
    public static void printScores(){
        System.out.printf("%-10s%-20s%-20s\n", "", "Player", "Computer");
        for(int i = 0; i < 50; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-10s%-20d%-20d\n", "Score", playerScore, computerScore);
    }

    
    public static void detWinner(String playerMove, int computerMove){
        String winningComb = "PSR";
        String losingComb = "SRP";
        if(winningComb.indexOf(playerMove) == computerMove){
            System.out.println("You Win!!!");
            playerScore += 1;
        }else if(losingComb.indexOf(playerMove) == computerMove){
            System.out.println("You Lose!!!");
            computerScore += 1;
        }else{
            System.out.println("It's a tie");
        }
    }

    public static void main(String[] args){
        
        String moves = "RPS";

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your move:");
        String userMove = scnr.next().toUpperCase();
        outerloop:
        while(!userMove.equals("Q")){
            int compMove = (int)(Math.random() * moves.length());
            int indexOfUserMove = moves.indexOf(userMove);
        
            while(indexOfUserMove == -1 || userMove.length() != 1){
                System.out.println("Move Invalid!!!");
                System.out.println();
                System.out.println("Enter your move:");
                userMove = scnr.next().toUpperCase();
                indexOfUserMove = moves.indexOf(userMove);
                if(userMove.equals("Q")){
                    break outerloop;
                }
            }
            System.out.printf("Your move is: %s\n", userMove);
            System.out.printf("Computers move is: %s\n", moves.substring(compMove, compMove+1));
            detWinner(userMove, compMove);
            System.out.println();
            System.out.println("Enter your move:");
            userMove = scnr.next().toUpperCase();    
        }
        printScores();
        scnr.close();
    }
}