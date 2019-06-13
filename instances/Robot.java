package instances;

public class Robot{
    public static void main(String[] args) {
        Arm robotArm1 = new Arm(23);
        Arm robotArm2 = new Arm(41);
        robotArm1.moveArm();
        robotArm2.moveArm();
    }
}

