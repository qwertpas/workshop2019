package inheritance;

public class RoboRIO{
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.wpilibStuff1();
        robot.autonomousInit();
        robot.autonomousPeriodic();
        robot.wpilibStuff2();
        robot.teleopInit();
        robot.teleopPeriodic();
    }
}

