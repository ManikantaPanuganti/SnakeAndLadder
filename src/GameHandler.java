
import java.util.*;
public class GameHandler {
     static Player changePlayer(Player cp, Player p1, Player p2){
        if(cp==p1){
            return p2;
        }
        else {
            return p1;
        }
    }


    public static void main(String[] args){
        Board board=new Board();
        Dice dice=new Dice();
        Player p1 = new Player("P1",0);
        Player p2 = new Player("P2",0);
        Player currentPlayer=p1;
        Scanner scan=new Scanner(System.in);
        int position,diceNumber,newPosition;
        while(p1.getPosition()!=100 && p2.getPosition()!=100){
            System.out.println(currentPlayer.getName()+" at "+currentPlayer.getPosition() +" his Turn ...Press enter to roll Dice...");
            scan.nextLine();
            diceNumber=dice.roll();
            System.out.println("Dice Rolled and got "+diceNumber);
            if(board.checkForSnakeOrLadder(diceNumber+currentPlayer.getPosition())){
                System.out.println(currentPlayer.getName()+" got a "+board.map.get(diceNumber+currentPlayer.getPosition()).getName());
                newPosition=board.map.get(diceNumber+currentPlayer.getPosition()).getEndingPosition();

            }
            else{
                if(diceNumber+currentPlayer.getPosition()>100){
                    newPosition=currentPlayer.getPosition();
                }else {
                    newPosition = diceNumber + currentPlayer.getPosition();
                }
            }
            currentPlayer.setPosition(newPosition);
            System.out.println(currentPlayer.getName()+" moved to "+currentPlayer.getPosition());
            if(currentPlayer.getPosition()==100){
                System.out.println(currentPlayer.getName()+" has won the game");
            }
            if(diceNumber!=6 || diceNumber+currentPlayer.getPosition()>100){
                currentPlayer=changePlayer(currentPlayer,p1,p2);
            }


        }
        //System.out.println("someone won the game");
    }
}
