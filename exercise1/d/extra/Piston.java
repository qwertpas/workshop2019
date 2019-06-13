package exercise1.d.extra;

public class Piston{
    private static int numPistons = 0; //private isn't neccessary. If this was public, getNumPistons() would not be needed.
    private static int numExtendedPistons = 0;
    public Piston(int length){
        this.length = length; //for less confusion, you can also use different names like length_input
        numPistons++;
    }
    static int getNumPistons(){
        return numPistons;
    }
    static int getNumExtendedPistons(){
        return numExtendedPistons;
    }

    int length;
    public void extend(){
        System.out.println("extend " + length + " inches");
        numExtendedPistons++;
    }
    public void retract(){
        System.out.println("retract");
        numExtendedPistons--;
    }
    
}