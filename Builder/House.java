package Builder;

public class House {
    //needed info about the house
    private String streetAddress;
    private int volume;
    private int quantityOfRooms;
    private int quantityOfRestroom;
    private double price;
    //getters
    public String getStreetAddress() {
        return streetAddress;
    }

    public int getVolume() {
        return volume;
    }

    public int getQuantityOfRooms() {
        return quantityOfRooms;
    }

    public int getQuantityOfRestroom() {
        return quantityOfRestroom;
    }

    public double getPrice() {
        return price;
    }

    public class HouseBuilder implements IHouse{
        //using override methods to input data in the House interface
        @Override
        public HouseBuilder setAddress(String add) {
            streetAddress = add;
            return this;
        }

        @Override
        public HouseBuilder setVolume(int vol) {
            volume = vol;
            return this;
        }

        @Override
        public HouseBuilder setQuantityOfRooms(int q) {
            quantityOfRooms = q;
            return this;
        }

        @Override
        public HouseBuilder setQuantityOfRestrooms(int q) {
            quantityOfRestroom = q;
            return this;
        }

        @Override
        public HouseBuilder setPrice(int p) {
            price = p;
            return this;
        }

        public House build() {
            return House.this;
        }
    }
}
