package abstractFactory;

public class Application {
    public static void main(String[] args) {
        VictorianFurnitureFactory factory1 = new VictorianFurnitureFactory();

        Chair chair1 = factory1.createChair();
        CoffeeTable coffeeTable1 = factory1.createCoffeeTable();
        Sofa sofa1 = factory1.createSofa();

        chair1.sitOn();
        coffeeTable1.sitAt();
        sofa1.sitOn();

        ModernFurnitureFactory factory2 = new ModernFurnitureFactory();

        Chair chair2 = factory2.createChair();
        CoffeeTable coffeeTable2 = factory2.createCoffeeTable();
        Sofa sofa2 = factory2.createSofa();

        chair2.sitOn();
        coffeeTable2.sitAt();
        sofa2.sitOn();
    }
}
