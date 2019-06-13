package exercise1.a;

import java.util.concurrent.TimeUnit; //don't need if you use Thread.sleep(1000)

public class Robot {
    static Piston myPiston = new Piston();
    public static void main(String[] args) {
        myPiston.extend();
        try {
            TimeUnit.SECONDS.sleep(1);
            // or Thread.sleep(1000)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myPiston.retract();
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