package abstractFactory;

public class ModernChair implements Chair{
    public ModernChair(){

    }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("You sat on a modern chair. It's not really comfortable.");
    }
}
