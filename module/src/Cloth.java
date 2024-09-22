public abstract class Cloth {
    private String name;
    private final String material;
    private final String color;
    private final char size;
    private final int season;
    private boolean cleanliness;

    public Cloth(String name, String material, String color, Character size, Integer season, Boolean cleanliness) {
        this.name = name;
        this.material = material;
        this.color = color;
        this.size = size;
        this.season = season;
        this.cleanliness = cleanliness;
    }

    public void displayClothInfo() {
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);

        System.out.println("Season: " + season);
        System.out.println("Cleanliness: " + (cleanliness?"청결함":"더러움"));
    }

    public void changeClothName(String name) {
        this.name = name;
    }
}