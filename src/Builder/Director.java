package Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make(String type){
        builder.reset();
        if(type ==  "Regular"){
            builder.buildWalls();
            builder.buildDoors();
            builder.buildWindows();
            builder.buildRoof();
            builder.buildGarage();
        }
        else if(type == "Stone"){
            builder.buildWalls();
            builder.buildDoors();
            builder.buildWindows();
            builder.buildRoof();
        }
    }
}
