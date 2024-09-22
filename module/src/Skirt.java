public class Skirt extends Bottom {
    char lineType;

    public Skirt(String name, String material, String color, Character size, Integer season, Boolean cleanliness, int legLength, char LineType) {
        super(name, material, color, size, season, cleanliness, legLength);
        this.lineType = LineType;
    }
}
