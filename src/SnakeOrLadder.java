public class SnakeOrLadder {
     private String name;
     private int startingPosition;
     private int endingPosition;

    public SnakeOrLadder(String name,int startingPosition,int endingPosition) {
        this.startingPosition = startingPosition;
        this.name=name;
        this.endingPosition=endingPosition;
    }

    public int getEndingPosition() {

        return endingPosition;
    }

    public void setEndingPosition(int endingPosition) {

        this.endingPosition = endingPosition;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(int startingPosition) {
        this.startingPosition = startingPosition;
    }
}
