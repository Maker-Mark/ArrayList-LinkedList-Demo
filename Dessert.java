public class Dessert extends Food {
  private String origin;
  private boolean celebration;
  
  public Dessert() {
    this("", false, 0, "", false);
  }
  
  public Dessert(String type, boolean poison, int cals, String origin, boolean celebration) {
    super(type, poison, cals);
    this.origin = origin;
    this.celebration = celebration;
  }
  
  @Override
  public String toString() {
    return "A " + super.getType() + " originating from " + this.origin +
      ", celebrateable: " + this.celebration;
  }
}