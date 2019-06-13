package exercise1.c;

import java.util.concurrent.TimeUnit; //don't need if you use Thread.sleep(1000)

public class Robot {
    static Piston frontPiston = new Piston(5);
    static Piston backPiston = new Piston(8);
    public static void main(String[] args) {
        System.out.println("There are " + Piston.getNumPistons() + " pistons");
        frontPiston.extend();
        try {
            TimeUnit.SECONDS.sleep(1);
            // or Thread.sleep(1000)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        frontPiston.retract();
        backPiston.extend();
        try {
            TimeUnit.SECONDS.sleep(1);
            // or Thread.sleep(1000)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        backPiston.retract();
    }
}

// You can also declare myPiston inside main(). This means that other functions
// within Robot.java cannot access myPiston, but that's ok in this example.

// public class Robot {
//     public static void main(String[] args) {
//         Piston myPiston = new Piston();
//         myPiston.extend();
//         try {
//             TimeUnit.SECONDS.sleep(1);
//             // or Thread.sleep(1000)
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         myPiston.retract();
//     }
// }