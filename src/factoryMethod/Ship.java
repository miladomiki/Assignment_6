package factoryMethod;

public class Ship implements Transport{
    public Ship(){

    }

    @Override
    public void deliver(){
        System.out.println("Delivery is done by a ship.");
    }
}
