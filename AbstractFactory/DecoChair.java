package AbstractFactory;

public class DecoChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("artDeco Chair has 3 legs;");
    }
    //number of legs that Chair has
    @Override
    public void sitOn() {
        System.out.println("can sit on artDeco");
    }
    //able to sit on
    @Override
    public void hasSeats() {
        System.out.println("actDeco Chair has two seats");
    }
    //number od seats that chair has
}
