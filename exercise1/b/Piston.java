package exercise1.b;

public class Piston{
    int length;
    public Piston(int length){
        this.length = length; //for less confusion, you can also use different names like length_input
    }
    public void extend(){
        System.out.println("extend " + length + " inches");
    }
    public void retract(){
        System.out.println("retract");
    }
    
}