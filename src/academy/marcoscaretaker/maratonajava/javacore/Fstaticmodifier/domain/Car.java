package academy.marcoscaretaker.maratonajava.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maximumSpeed;
    private static double speedLimit = 250;

    public Car(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public static void setSpeedLimit(double speedLimit){
        Car.speedLimit = speedLimit;
    }

    public static double getSpeedLimit(){
        return Car.speedLimit;
    }

    public void print(){
        System.out.println("------------");
        System.out.println("Car name: "+this.name);
        System.out.println("Maximum speed: "+this.maximumSpeed);
        System.out.println("Speed limit: "+Car.speedLimit);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

}
