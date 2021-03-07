package AbstractFactory;

public class VictorianBed implements Bed{
    @Override
    public void hasLegs() {
        System.out.println("victorian bed has 8 legs");
    }

    @Override
    public void hasLyingPlaces() {
        System.out.println("victorian bed has 4 seats");
    }

    @Override
    public void sitOn() {
        System.out.println("can sit on victorian bed");
    }

    @Override
    public void lieOn() {
        System.out.println("can lie on victorian bed");
    }
}