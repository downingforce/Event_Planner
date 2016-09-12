import java.io.Console;

public class App {
  public static void main(String[] args) {

    Console myConsole = System.console();
    System.out.println("Hi, welcome to the store!");
    System.out.println("Would you like to plan a new event? (type Y or N)");
    String startEventPlan = myConsole.readLine();
    if (startEventPlan.equalsIgnoreCase("y")) {
     System.out.println("Great, how many people are you expecting?");
     Integer guests = Integer.parseInt(myConsole.readLine());
     System.out.println("Alrighty, what kind of food would you like? (type choice) Pizza, BBQ, Hors d'oeuvres, Sandwiches, or Sushi?");
     String food = myConsole.readLine().toLowerCase();
     System.out.println("Okay, what kind of beverage would you like? (type choice) Water, Soft Drinks, Beer, Cocktails, or Wine?");
     String beverage = myConsole.readLine().toLowerCase();
     System.out.println("Alrighty, what kind of entertainment would you like? (type choice) Music, Band, Magician, Inflatables, or None?");
     String entertainment = myConsole.readLine().toLowerCase();
     EventPlan newParty = new EventPlan (guests, food, beverage, entertainment);
     System.out.println("Okay, hear is what your party would cost: $" + newParty.eventCostTotal());

    } else {
     System.out.println("Okay, take your time and let us know when you need to throw a great party!");
    }
    // public static showTotalCost (EventPlan newParty) {
    // System.out.println("Okay, hear is what your party would cost:" + newParty.eventCostTotal());
    // }
  }
}
