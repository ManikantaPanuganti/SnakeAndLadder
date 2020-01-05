import java.util.HashMap;
public class Board {
    HashMap<Integer , SnakeOrLadder> map=new HashMap<>();
    Board(){
        //snakes
        map.put(16,new SnakeOrLadder("Snake",16,8));
        map.put(52,new SnakeOrLadder("Snake",52,28));
        map.put(78,new SnakeOrLadder("Snake",78,25));
        map.put(93,new SnakeOrLadder("Snake",93,89));
        map.put(95,new SnakeOrLadder("Snake",95,75));
        map.put(99,new SnakeOrLadder("Snake",99,21));
        //Ladders
        map.put(2,new SnakeOrLadder("Ladder",2,45));
        map.put(4,new SnakeOrLadder("Ladder",4,27));
        map.put(9,new SnakeOrLadder("Ladder",9,31));
        map.put(47,new SnakeOrLadder("Ladder",47,84));
        map.put(70,new SnakeOrLadder("Ladder",70,87));
        map.put(71,new SnakeOrLadder("Ladder",71,91));

    }
    boolean checkForSnakeOrLadder(int position){
        return map.containsKey(position);
    }
    SnakeOrLadder getSnakeOrLadder(int position){
        return map.get(position);
    }
    int giveNewPosition(int position){
        SnakeOrLadder snakeOrLadder;
        if(checkForSnakeOrLadder(position)){
            snakeOrLadder=getSnakeOrLadder(position);
            System.out.println("got a "+snakeOrLadder.getName());
            position=snakeOrLadder.getEndingPosition();
        }
        return position;
    }


}
