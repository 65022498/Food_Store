package Human;

public class Customer extends Human {
    private double moneys;

    public Customer(String name) {
        super(name);
    }

    public void CanAfford(Double Price) {
        this.moneys = Price;
        System.out.println("Customer paid :" + this.moneys);
    }

    public void Eat(String foodName) {
        System.out.println("Customer is eating " + foodName);
    }

    public void Poop() {
        System.out.println(this.GetName() + " is spitting out the food from anal.");
    }
}