package abstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory{
    public ModernFurnitureFactory(){

    }

    @Override
    public Chair createChair() {
        ModernChair chair = new ModernChair();
        return chair;
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        ModernCoffeeTable coffeeTable = new ModernCoffeeTable();
        return coffeeTable;
    }

    @Override
    public Sofa createSofa() {
        ModernSofa sofa = new ModernSofa();
        return sofa;
    }
}
