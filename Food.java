public class Food
{
  private String type;
  private int cals;
  private boolean poison;
  
  public Food()
  {
    type = "dunno, take a byte";
    poison = true;
    cals = 9001;
  }

  public Food(String type, boolean poison, int cals)
  {
    this.type = type;
    this.poison = poison;
    this.cals = cals;
  } 
  
  public String toString()
  {
    return "Type of food:" + this.type + 
      ". Has "  + this.cals + " calories. Is it poison? " + poison; 
  }
  
  public int getCalories()
  {
    return cals;
  }
  
  public String getType() {
    return this.type;
  }
}