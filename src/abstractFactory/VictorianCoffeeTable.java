package abstractFactory;

public class VictorianCoffeeTable implements CoffeeTable{
    public VictorianCoffeeTable(){

    }

    @Override
    public void sitAt() {
        System.out.println("You sat at the victorian coffe table. You feel wealthy.");
    }
}
