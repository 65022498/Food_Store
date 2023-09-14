package Shop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private Boolean openClose;
    public ArrayList<Food> foods; 

    public Shop(String name, Boolean openClose) {
        this.name = name;
        this.openClose = openClose;
        this.foods = new ArrayList<Food>();
    }

    public void AddFood(String name, String type , double price) {
        Food food = new Food(name, type, price);
        foods.add(food);
    }

    public String getName() {
        return name;
    }

    public Boolean getopenClose() {
        return openClose;
    }

    public void setShopName(String name) {
        this.name = name;
    }

    public void setopenClose(Boolean openClose) {
        this.openClose = openClose;
    }

    public void displayInfo() {
        System.out.println("Shop Name : " + name);
        System.out.println("Shop Status : " + openClose);
    }

    public void ShowMenu() {
        for (Food food : foods) {
            System.out.println("Name"+food.getName() + "\t type: " + food.getType() + "\t price" + food.getPrice());
        }
    }
}
