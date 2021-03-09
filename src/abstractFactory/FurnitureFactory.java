package abstractFactory;

public interface FurnitureFactory {
    public Chair createChair();

    public CoffeeTable createCoffeeTable();

    public Sofa createSofa();
}
