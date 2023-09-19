package Shop;

public class Food {

    private static int seed;

    private String name;
    private String type;
    private double price;

    private int food_id;

    public Food(String name, String type, double price) {
        this.name = name; 
        this.type = type; 
        this.price = price;
        this.food_id = seed;
        seed++;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int GetID() {
        return this.food_id;
    }

    public void displayInfo() {
        System.out.println("Food Name :" + name);
        System.out.println("Food Type :" + type);
        System.out.println("Food Price :" + price);
    }

}
