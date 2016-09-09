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
