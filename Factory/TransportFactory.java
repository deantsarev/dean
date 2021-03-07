package Factory;

public class TransportFactory {
    public Transport getTransport(Transports transportsType){
        if(transportsType == null){
            return null;
        }//if delivery wasn't made, code returns nothing
        else if(Transports.SHIP == transportsType){
            return new Ship();
        }//if delivery was made by Ship, code refers to Ship class
        else if(transportsType == Transports.TRUCK){
            return new Truck();
        }//if delivery was made by Truck, code refers to Truck class
        else if(transportsType == Transports.AIRPLANE){
            return new Airplane();
        }//if delivery was made by Airplane, code refers to Airplane class
        return null;
    }
}