package exercise1.d.extra;

import java.util.concurrent.TimeUnit;

public class Robot {
    static Piston frontPiston = new Piston(5);
    static Piston backPiston = new Piston(8);
    public static void main(String[] args) {
        printNumPistons();
        frontPiston.extend();
        printNumExtendedPistons();
        delay(1);
        frontPiston.retract();
        printNumExtendedPistons();
        backPiston.extend();
        printNumExtendedPistons();
        delay(1);
        backPiston.retract();
        printNumExtendedPistons();
    }

    private static void printNumPistons(){
        if(Piston.getNumPistons() == 1){
            System.out.println("There is 1 piston.");
        }else{
            System.out.println("There are " + Piston.getNumPistons() + " pistons.");
        }
    }

    private static void printNumExtendedPistons(){
        if(Piston.getNumExtendedPistons() == 1){
            System.out.println("There is 1 extended piston.");
        }else{
            System.out.println("There are " + Piston.getNumExtendedPistons() + " extended pistons.");
        }
    }

    private static void delay(int secondDelay){
        try {
            TimeUnit.SECONDS.sleep(secondDelay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

