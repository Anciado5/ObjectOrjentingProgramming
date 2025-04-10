import java.time.Year;

public class Building {

    public int year;

    public int floors;

    public int flats;

    public String type;

    public double flatsPerFloor(){
        return (double) this.flats / this.floors;
    }

    public int buildingAge(){
        return Year.now().getValue() - this.year;
    }
}


