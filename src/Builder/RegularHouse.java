package Builder;

public class RegularHouse extends House{
    private boolean walls;
    private boolean doors;
    private boolean windows;
    private boolean roof;
    private boolean garage;

    public RegularHouse(){
        walls = false;
        doors = false;
        windows = false;
        roof = false;
        garage = false;
    }

    public void setWalls(boolean walls) {
        this.walls = walls;
    }

    @Override
    public boolean hasWalls() {
        return walls;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    @Override
    public boolean hasDoors() {
        return doors;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    @Override
    public boolean hasWindows() {
        return windows;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public boolean hasGarage() {
        return garage;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    @Override
    public boolean hasRoof() {
        return roof;
    }

    @Override
    public String toString() {
        return "RegularHouse{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", windows=" + windows +
                ", roof=" + roof +
                ", garage=" + garage +
                '}';
    }
}
