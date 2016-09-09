public class EventPlan {
  private Integer mGuestNumber;
  private String mFoodChoice;
  private String mBeverageChoice;
  private String mEntertainmentChoice;

  public EventPlan (Integer guests, String food, String beverage, String entertainment) {
    mGuestNumber = guests;
    mFoodChoice = food;
    mBeverageChoice = beverage;
    mEntertainmentChoice = entertainment;
  }

  public Integer foodCostTotal() {
    Integer foodCost = 0;
    if (getFoodChoice() == "Pizza") {
      foodCost = 5.99;
    } else if (getFoodChoice() == "BBQ") {
      foodCost = 6.99;
    } else if (getFoodChoice() == "Hors d'oeuvres") {
      foodCost = 2.99;
    } else if (getFoodChoice() == "Sandwiches") {
      foodCost = 3.99;
    } else if (getFoodChoice() == "Burgers") {
      foodCost = 4.99;
    } else if (getFoodChoice() == "Sushi") {
      foodCost = 7.99;
    }
    return foodCost;
  }

  public Integer getGuestNumber() {
    return mGuestNumber;
  }

  public String getFoodChoice() {
    return mFoodChoice;
  }

  public String getBeverageChoice() {
    return mBeverageChoice;
  }

  public String getEntertainmentChoice() {
    return mEntertainmentChoice;
  }
}
