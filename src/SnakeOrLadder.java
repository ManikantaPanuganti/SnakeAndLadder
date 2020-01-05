public class SnakeOrLadder {
     private String name;
     private int startingPosition;
     private int endingPosition;

    public SnakeOrLadder(String name,int startingPosition,int endingPosition) {
        this.name=name;
        this.startingPosition = startingPosition;
        this.endingPosition=endingPosition;
    }

    public int getEndingPosition() {
        return endingPosition;
    }

    public String getName() {
        return name;
    }
    public int getStartingPosition() {
        return startingPosition;
    }

}
