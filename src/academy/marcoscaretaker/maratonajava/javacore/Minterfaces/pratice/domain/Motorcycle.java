package academy.marcoscaretaker.maratonajava.javacore.Minterfaces.pratice.domain;

public class Motorcycle implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Turning Off the motorcycle");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Motorcycle accelerating at high speed "+speed);
    }
}
