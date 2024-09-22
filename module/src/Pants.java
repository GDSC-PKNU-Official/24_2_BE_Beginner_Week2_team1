public class Pants extends Bottom{
    String fitType;


    public Pants(String name, String material, String color, Character size, Integer season, Boolean cleanliness, int legLength, String fitType) {
        super(name, material, color, size, season, cleanliness, legLength);
        this.fitType = fitType;
    }
}
