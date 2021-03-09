package factoryMethod;

public class Application {
    public static void main(String[] args) {
        Logistics road = new RoadLogistics();
        road.planDelivery();

        Logistics sea = new SeaLogistics();
        sea.planDelivery();
    }
}
