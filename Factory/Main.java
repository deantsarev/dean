package Factory;

public class Main {
    public static void main(String[] args) {
        TransportFactory tf = new TransportFactory();

        Transport ship = tf.getTransport(Transports.SHIP);
        ship.deliver();
        //refers to SHIP delivery type
        Transport truck = tf.getTransport(Transports.TRUCK);
        truck.deliver();
        //refers to TRUCK delivery type
        Transport airplane = tf.getTransport(Transports.AIRPLANE);
        airplane.deliver();
        //refers to AIRPLANE delivery type
    }
}