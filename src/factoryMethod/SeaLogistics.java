package factoryMethod;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        Ship ship = new Ship();
        return ship;
    }
}
