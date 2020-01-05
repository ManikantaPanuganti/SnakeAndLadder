
import java.util.*;
public class Game {
    Board board;
    Dice dice;
    Player player1;
    Player player2;
    Player currentPlayer;


    Game(){
        board=new Board();
        dice = new Dice();
        player1= new Player("Motu",0,100);
        player2= new Player("patlu",0,100);
        currentPlayer=player1;
    }


    void changeTurn(){
        if(currentPlayer==player1){
            System.out.println(player2.getName()+"'s turn");
            currentPlayer=player2;
        }
            System.out.println(player1.getName()+"'s turn");
            currentPlayer =player1;
    }


    boolean isGameOver(){
        int winningPosition=100;
        if(currentPlayer.getPosition()==winningPosition){
            System.out.println(currentPlayer.getName()+" has won the game");
            return true;
        }
        return false;
    }

    void displayPlayer(){
        System.out.println(currentPlayer.getName()+" at "+currentPlayer.getPosition());

    }

    void startGame(){
        int diceNumber,newPosition,oldPosition;
        while(!isGameOver()){
            displayPlayer();
            diceNumber=currentPlayer.rollDice(dice);
            oldPosition=currentPlayer.getPosition();
            newPosition=oldPosition+diceNumber;
            newPosition=board.giveNewPosition(newPosition);
            currentPlayer.move(newPosition);
            if(diceNumber!=6){
                changeTurn();
            }
        }
    }
}
