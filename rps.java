import java.util.*;

public class rps{
    public static void main(String[] args){
        
        char[] moves = {'R', 'P', 'S'};
        boolean validMove = false;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your move:");
        char userMove = scnr.next().charAt(0);

        int randomInt = (int)(Math.random() * moves.length);

        char computerMove = moves[randomInt];
        
        for(int i = 0; i<moves.length; i++){
            if(Character.toUpperCase(userMove) == moves[i]){
                validMove = true;
            }
        }
        
        System.out.println(computerMove);
        scnr.close();
    }
}