public class Dice {
    int roll(){
        double d= (Math.random()*6);
        int k= (int) d;
        System.out.println("Dice Rolled and got "+(k+1));
        return k+1;
    }
}
