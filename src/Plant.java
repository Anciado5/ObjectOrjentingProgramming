public class Plant {

    public Plant(){
    }
    public Plant(String name, String latinName, boolean annual, String continent, int height, boolean edible){//konstruktorius
        this.name = name;
        this.latinName = latinName;
        this.annual = annual;
        this.continent = continent;
        this.height = height;
        this.edible = edible;
    }

    @Override
    public String toString(){
        return "Name:" + this.name + ", Latin name:" + this.latinName + ", Annual:" + this.annual + ", Continent:" + this.continent
                + ", Height:" + this.height + ", Edible:" + this.edible;
    }

    private String name;//++
    private String latinName;//++
    private boolean annual;//++
    private String continent;//++
    private int height;//++
    private boolean edible;//++

    public String getName() {//geteris
        return this.name;
    }
    public void setName(String name) {//seteris
        this.name = name;
    }
    public String getLatinName() {
        return this.latinName;
    }
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    public boolean getAnnual() {
        return this.annual;
    }
    public void setAnnual(boolean annual) {
        this.annual = annual;
    }
    public String getContinent() {
        return this.continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public boolean getEdible() {
        return this.edible;
    }
    public void setEdible(boolean edible) {
        this.edible = edible;
    }



















}
