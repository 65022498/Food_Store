package Shop;

public class Candy extends Food {
    private String expirationDate;

    public Candy(String name, String type, double price, String exp) {
        super(name, type, price);
        this.expirationDate = exp;
    }

    public String getexpirationDate() {
        return this.expirationDate;
    }

    public void setexpirationDate(String exp) {
        this.expirationDate = exp;
    }

    @Override
    public String toString() {
        return "Candy [name= " + this.getName() + "type= " + this.getType() + ", price= " + this.getPrice()
                + ", expirationDate= " + expirationDate + " ]";
    }

    // public static void main(String[] args) {
    // Candy Coffee_Candy = new Candy("Brugano", "sweet", 2, "1/1/1");
    // System.out.println(Coffee_Candy.toString());
    // }
}