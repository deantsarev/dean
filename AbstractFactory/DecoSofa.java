package AbstractFactory;

public class DecoSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("artDeco sofa has 4 legs;");
    }
    //number of legs that Sofa has
    @Override
    public void sitOn() {
        System.out.println("can sit on artDeco sofa");
    }
    //able to sit on
    @Override
    public void hasSeats() {
        System.out.println("artDeco sofa has 5 seats;");
    }
    //number of seats that chair has
    @Override
    public void lieOn() {
        System.out.println("can lie on artDeco sofa");
    }
    //able to lie on
}
