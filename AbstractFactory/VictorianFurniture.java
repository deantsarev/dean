package AbstractFactory;

public class VictorianFurniture implements Furniture{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Bed createBed() {
        return new VictorianBed();
    }
}