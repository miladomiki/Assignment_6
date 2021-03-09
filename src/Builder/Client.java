package Builder;

public class Client {
    public static void main(String[] args) {
        WoodBuilder builder1 = new WoodBuilder();
        Director director = new Director(builder1);
        director.make("Regular");
        RegularHouse house1 = builder1.getResult();
        System.out.println(house1);

        StoneBuilder builder2 = new StoneBuilder();
        director.changeBuilder(builder2);
        director.make("Stone");
        StoneHouse house2 = builder2.getResult();
        System.out.println(house2);
    }
}
