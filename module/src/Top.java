public abstract class Top extends Cloth {
    private String sleeveLength;

    public Top(String name, String material, String color, Character size, Integer season, Boolean cleanliness, String sleeveLength) {
        super(name, material, color, size, season, cleanliness);
        this.sleeveLength = sleeveLength;
    }

    public String getSleeveLength() {
        return sleeveLength;
    }
}