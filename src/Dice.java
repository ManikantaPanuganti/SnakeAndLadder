public class Dice {
    int roll(){
        double d= (Math.random()*6);
        int k= (int) d;
        return k+1;
    }
}
