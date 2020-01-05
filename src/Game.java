
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


    Player changeTurn(){
        if(currentPlayer==player1){
            System.out.println(player2.getName()+"'s turn");
            return player2;
        }
            System.out.println(player1.getName()+"'s turn");
            return player1;
    }


    boolean checkWhetherGameOver(){
        int winningPosition=100;
        if(player1.getPosition()==winningPosition){
            System.out.println(player1.getName()+" has won the game");
            return true;
        }
        else if(player2.getPosition()==winningPosition){
            System.out.println(player2.getName()+" has won the game");
            return true;
        }
        return false;
    }

    void displayPlayer(){
        System.out.println(currentPlayer.getName()+" at "+currentPlayer.getPosition());

    }

    void startGame(){
        Scanner scan=new Scanner(System.in);
        int diceNumber,newPosition,oldPosition;
        while(!checkWhetherGameOver()){
            displayPlayer();
            scan.nextLine();
            diceNumber=currentPlayer.rollDice(dice);
            oldPosition=currentPlayer.getPosition();
            newPosition=oldPosition+diceNumber;
            newPosition=board.giveNewPosition(newPosition);
            currentPlayer.move(newPosition);
            if(diceNumber!=6){
                currentPlayer=changeTurn();
            }
        }
    }
}
