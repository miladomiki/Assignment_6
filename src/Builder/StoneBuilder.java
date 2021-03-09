package Builder;

public class StoneBuilder implements Builder{
    private StoneHouse result;

    @Override
    public void reset(){
        result = new StoneHouse();
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

    public StoneHouse getResult() {
        return result;
    }
}
