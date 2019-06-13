package instances;

public class Arm{

    int angleToMove;

    // This is a constructor
    public Arm(int angleToMove){ 
        this.angleToMove = angleToMove;
    }

    //This is a function inside the class
    public void moveArm(){
        // Insert code to move arm on actual robot
        System.out.println("arm has moved " + angleToMove + " degrees");
    }
}