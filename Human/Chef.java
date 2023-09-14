package Human;

public class Chef extends Human {
  private StatusOfChef status;

  public Chef(String name) {
    super(name);
    status = StatusOfChef.Waiting;
  }

  @Override
  public void Eat(String name) {
    status = StatusOfChef.Eating;
  }

  @Override
  public void Poop() {
    status = StatusOfChef.Pooping;
  }

  public void ReceiveOrder() {
    // Get order food
    System.out.println(this.GetName() + " is cooking for you.");
  }

  public String GetStatus() {
    switch (status) {
      case Pooping:
        return "pooping";
      case Cooking:
        return "cooking";
      case Eating:
        return "eating";
    }

    return "f";
  }

}

enum StatusOfChef {
  Waiting,
  Cooking,
  Eating,
  Pooping
}