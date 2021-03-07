package Factory;

public class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by AIRPLANE");
    }
    //Overriding deliver method in Transport to the necessary output, related to Airplane
}