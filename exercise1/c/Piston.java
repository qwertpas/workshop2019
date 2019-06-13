package exercise1.c;

public class Piston{
    private static int numPistons = 0; //private isn't neccessary. If this was public, getNumPistons() would not be needed.
    public Piston(int length){
        this.length = length; //for less confusion, you can also use different names like length_input
        numPistons++;
    }
    static int getNumPistons(){
        return numPistons;
    }

    int length;
    public void extend(){
        System.out.println("extend " + length + " inches");
    }
    public void retract(){
        System.out.println("retract");
    }
    
}