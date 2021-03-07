package Factory;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by TRUCK");
    }
    //Overriding deliver method in Transport to the necessary output, related to Truck
}