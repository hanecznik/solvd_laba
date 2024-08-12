public class Fish extends Animal {
    private String waterType;

    public Fish(String species, Food food, String waterType) {
        super(species, food);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Water Type: " + waterType;
    }
}
