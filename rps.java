import java.util.*;

public class rps{
    public String playerWin(char playerMove, int computerMove){
        char[] winningComb = {'P', 'S', 'R'};
        char[] losingComb = {'S', 'R', 'P'};
        
        
        return "tie";
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
            System.out.printf("Computers move is: %s\n\n", moves.substring(compMove, compMove+1));
            
            System.out.println("Enter your move:");
            userMove = scnr.next().toUpperCase();    
        }

        scnr.close();
    }
}