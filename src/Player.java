public class Player {
    private String name;
    private int position;
    private int boardSize;
    public Player(String name, int position,int boardSize) {
        this.name = name;
        this.position = position;
        this.boardSize=boardSize;
    }

    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }

    public void move(int position) {
        if(position<=boardSize) {
            this.position = position;
        }
    }
    int rollDice(Dice dice){
        return dice.roll();
    }
}
