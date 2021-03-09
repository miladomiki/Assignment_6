package abstractFactory;

public class VictorianChair implements Chair{
    public VictorianChair(){

    }

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("You sat on a victorian chair. It's quite comfortable.");
    }
}
