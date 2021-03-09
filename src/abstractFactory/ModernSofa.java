package abstractFactory;

public class ModernSofa implements Sofa{
    public ModernSofa(){

    }

    @Override
    public void sitOn() {
        System.out.println("You sat on the modern sofa. Secretely, you wish you bought a victorian sofa.");
    }
}
