import java.util.*;
public class rps{
    public static void main(String[] args){
        
        char[] moves = {'R', 'P', 'S'};
        boolean validMove = false;

        Scanner scnr = new Scanner(System.in);

        char userMove = scnr.next().charAt(0);

        for(int i = 0; i<moves.length; i++){
            if(Character.toUpperCase(userMove) == moves[i]){
                validMove = true;
            }
        }
        
        System.out.println(validMove);
        scnr.close();
    }
}