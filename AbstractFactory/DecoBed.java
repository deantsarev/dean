package AbstractFactory;

public class DecoBed implements Bed{
        @Override
        public void hasLegs() {
            System.out.println("artDeco bed has 5 legs;");
        }
        //number of legs that bed has
        @Override
        public void hasLyingPlaces() {
            System.out.println("artDeco bed has 3 seats");
        }
        //number of places to lie on
        @Override
        public void sitOn() {
            System.out.println("can sit on artDeco");
        }
        //able to sit on
        @Override
        public void lieOn() {
            System.out.println("can lie on actDeco bed");
        }
        //able to lie on
}
