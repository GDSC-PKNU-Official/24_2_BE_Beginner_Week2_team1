public class Shirt extends Top {
    private String collarShape;

    public Shirt(String name, String material, String color, Character size, Integer season, Boolean cleanliness, String sleeveLength, String collarShape) {
        super(name, material, color, size, season, cleanliness, sleeveLength);
        this.collarShape = collarShape;
    }

    @Override
    public void displayClothInfo() {
        super.displayClothInfo();
        System.out.println("Sleeve Length: " + this.getSleeveLength());
        System.out.println("Collar Shape: " + collarShape);
    }
}