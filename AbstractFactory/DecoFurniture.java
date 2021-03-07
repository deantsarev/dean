package AbstractFactory;

public class DecoFurniture implements Furniture{
    @Override
    public Chair createChair() {
        return new DecoChair();
    }
    //reference to Chair to create one
    @Override
    public Sofa createSofa() {
        return new DecoSofa();
    }
    //reference to Sofa to create one
    @Override
    public Bed createBed() {
        return new DecoBed();
    }
    //reference to Bed to create one
}
