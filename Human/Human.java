package Human;

abstract class Human {
  private String name;
  private String pronouns;

  public Human(String name) {
    this.name = name;
  }

  public String GetName() {
    return this.name;
  }

  public void SetName(String name) {
    this.name = name;
  }

  public void SetPronouns(String pronouns) {
    this.pronouns = pronouns;
  }

  public String GetPronouns() {
    return this.pronouns;
  }

  public abstract void Eat(String name);

  public abstract void Poop();

}
