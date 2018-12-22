import java.io.*;
import java.util.LinkedList;
import java.util.*;
public class Demo_LinkedList {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Food> arrFood = new ArrayList<>();
    LinkedList<Food> foods = new LinkedList<>();
    Dessert cake = new Dessert("Cake", false, 1500, "Scandinavian", true);
    Food sketchyApple = new Food("Apple", true, 95);
    
    //Demo of ArrayList
    String spot; //Temp "spot var to differentiate food postions in orinting
    for (int i = 0; i < 10; i++)     // for(Food fud: arrFood) 
    {
      spot = "Cake number " + i;
      Food aFood = new Food(spot, false, (i + 100));
      arrFood.add(aFood);
      System.out.println(arrFood.get(i));
    } 
        System.out.println("LOOK HERE");

    System.out.println(arrFood.get(1));
    arrFood.set(1, arrFood.get(3));
    System.out.println(arrFood.get(1));

                       
    
    // System.out.println(arrFood.
    //Get object from index of array list
    // Scanner
    
    //Demo of LinkedList
    foods.add(cake);
    foods.add(sketchyApple);
    for (Food item : foods) {
      item.getCalories();
      System.out.println(item);
    }
  }
}
