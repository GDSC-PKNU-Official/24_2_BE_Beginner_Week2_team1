public class Bottom extends Cloth {
    private int legLength;

    public Bottom(String name, String material, String color, Character size, Integer season, Boolean cleanliness, int legLength) {
        super(name, material, color, size, season, cleanliness);
        this.legLength = legLength;
    }
}
