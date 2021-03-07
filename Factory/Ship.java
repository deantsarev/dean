package Factory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by SHIP");
    }
    //Overriding deliver method in Transport to the necessary output, related to Ship
}