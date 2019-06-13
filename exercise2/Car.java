package exercise2;

public class Car extends Vehicle {
    public void refuel(){
        System.out.println("car refueled");
    }
    public int speedometer(){
        return speed;
    }
    public void setSpeed(int speed){
        super.speed = speed;
    }
    public static void main(String[] args) {
        // Exercise: which lines below would not work if Car did not inherit Vehicle?
        Car car = new Car();
        car.goForward();
        car.setSpeed(10);
        System.out.println("Speed is " + car.speedometer());
        car.goBackward();
    }
    
}


