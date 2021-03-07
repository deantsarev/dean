package AbstractFactory;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("victorian chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("can sit on victorian chair");
    }

    @Override
    public void hasSeats() {
        System.out.println(" victorian chair has 1 seat");
    }
}