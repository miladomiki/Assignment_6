package Builder;

public class WoodBuilder implements Builder{
    private RegularHouse result;

    @Override
    public void reset(){
        result = new RegularHouse();
    }

    @Override
    public void buildWalls() {
        result.setWalls(true);
    }

    @Override
    public void buildDoors() {
        result.setDoors(true);
    }

    @Override
    public void buildWindows() {
        result.setWindows(true);
    }

    @Override
    public void buildGarage() {
        result.setGarage(true);
    }

    @Override
    public void buildRoof() {
        result.setRoof(true);
    }

    public RegularHouse getResult() {
        return result;
    }
}
