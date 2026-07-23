package academy.marcoscaretaker.maratonajava.javacore.Minterfaces.pratice.domain;

public class Car implements Vehicle{
    @Override
    public void startEngine() {
         System.out.println("Starting the car: Vrum vrun");
    }

    @Override
    public void stopEngine() {
        System.out.println("Turning Off the Car");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerating at high speed "+speed);
    }
}
