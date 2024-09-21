public abstract class Cloth {
    private String name;
    private String material;
    private String color;
    private char size;
    private int season;
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
        System.out.println("Cleanliness: " + cleanliness);
    }
}