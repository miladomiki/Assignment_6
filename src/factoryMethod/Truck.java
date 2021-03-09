package factoryMethod;

public class Truck implements Transport{
    public Truck(){

    }

    @Override
    public void deliver() {
        System.out.println("Delivery is done by truck.");
    }
}
