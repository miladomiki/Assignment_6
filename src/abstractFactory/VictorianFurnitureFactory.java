package abstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory{
    public VictorianFurnitureFactory(){

    }

    @Override
    public Chair createChair() {
        VictorianChair chair = new VictorianChair();
        return chair;
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        VictorianCoffeeTable coffeeTable = new VictorianCoffeeTable();
        return coffeeTable;
    }

    @Override
    public Sofa createSofa() {
        VictorianSofa sofa = new VictorianSofa();
        return sofa;
    }
}
