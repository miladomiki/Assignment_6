package abstractFactory;

public class VictorianSofa implements Sofa{
    public VictorianSofa(){

    }

    @Override
    public void sitOn() {
        System.out.println("You sat on the victorian sofa.");
    }
}
