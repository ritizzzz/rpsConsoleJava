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
        
        int compMove = (int)(Math.random() * moves.length());
        int indexOfUserMove = moves.indexOf(userMove);
    
        while(indexOfUserMove == -1 || userMove.length() != 1){
            System.out.println("Enter your move:");
            userMove = scnr.next().toUpperCase();
            indexOfUserMove = moves.indexOf(userMove);
        }

        System.out.println(indexOfUserMove);
        scnr.close();
    }
}