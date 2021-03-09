package abstractFactory;

public class ModernCoffeeTable implements CoffeeTable{
    public ModernCoffeeTable(){

    }

    @Override
    public void sitAt() {
        System.out.println("You sat at the modern coffee table. You feel pretentious.");
    }
}
