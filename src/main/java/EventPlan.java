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

  public double foodCostTotal() {
    double foodCost = 0.00;
    if (getFoodChoice().equals("pizza")) {
      foodCost += 5.99;
    } else if (getFoodChoice().equals("bbq")) {
      foodCost += 6.99;
    } else if (getFoodChoice().equals("hors d'oeuvres")) {
      foodCost += 2.99;
    } else if (getFoodChoice().equals("sandwiches")) {
      foodCost += 3.99;
    } else if (getFoodChoice().equals("burgers")) {
      foodCost += 4.99;
    } else if (getFoodChoice().equals("sushi")) {
      foodCost += 7.99;
    }
    return foodCost;
  }

  public double beverageCostTotal() {
    double beverageCost = 0.00;
    if (getBeverageChoice().equals("water")) {
      beverageCost += 1.25;
    } else if (getBeverageChoice().equals("soft drinks")) {
      beverageCost += 1.99;
    } else if (getBeverageChoice().equals("deer")) {
      beverageCost += 4.99;
    } else if (getBeverageChoice().equals("cocktails")) {
      beverageCost += 8.99;
    } else if (getBeverageChoice().equals("wine")) {
      beverageCost += 7.99;
    }
    return beverageCost;
  }

  public double entertainmentCostTotal() {
    double entertainmentCost = 0.00;
    if (getEntertainmentChoice().equals("music")) {
      entertainmentCost += 2.99;
    } else if (getEntertainmentChoice().equals("band")) {
      entertainmentCost += 15.99;
    } else if (getEntertainmentChoice().equals("magician")) {
      entertainmentCost += 10.99;
    } else if (getEntertainmentChoice().equals("inflatables")) {
      entertainmentCost += 7.99;
    } else {
      entertainmentCost += 0.00;
    }
    return entertainmentCost;
  }

  public double eventCostTotal() {
    double eventCost = 0.00;
    eventCost += ((foodCostTotal() + beverageCostTotal() + entertainmentCostTotal()) * getGuestNumber());
    return eventCost;
  }

  // public static double round (double value, int places) {
  //   if (places < 0) throw new IllegalArgumentException();
  //
  //   BigDecimal bd = new BigDecimal(value);
  //   bd = bd.setScale(places, RoundingMode.HALF_UP);
  //   return bd.doubleValue();
  // }

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
