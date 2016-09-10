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

  public Integer beverageCostTotal() {
    Integer beverageCost = 0;
    if (getBeverageChoice() == "Water") {
      beverageCost = 1;
    } else if (getBeverageChoice() == "Soft Drinks") {
      beverageCost = 1.99;
    } else if (getBeverageChoice() == "Beer") {
      beverageCost = 4.99;
    } else if (getBeverageChoice() == "Cocktails") {
      beverageCost = 8.99;
    } else if (getBeverageChoice() == "Wine") {
      beverageCost = 7.99;
    }
    return beverageCost;
  }
  "Music", "Band", "Dancers", "Magician", "Inflatables"

  public Integer entertainmentCostTotal() {
    Integer entertainmentCost = 0;
    if (getEntertainmentChoice() == "Music") {
      entertainmentCost = 2.99;
    } else if (getEntertainmentChoice() == "Band") {
      entertainmentCost = 15.99;
    } else if (getEntertainmentChoice() == "Dancers") {
      entertainmentCost = 10.99;
    } else if (getEntertainmentChoice() == "Magician") {
      entertainmentCost = 10.99;
    } else if (getEntertainmentChoice() == "Inflatables") {
      entertainmentCost = 7.99;
    }
    return entertainmentCost;
  }

  public Integer eventCostTotal() {
    Integer eventCost = 0;
    eventCost += (foodCost + beverageCost + entertainmentCost) * guests;
    return eventCost;
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
