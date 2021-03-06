import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanTest {

  @Test
  public void newParty_instanceCreated_Event() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    assertEquals(true, newParty instanceof EventPlan);
  }

  @Test
  public void getGuestNumber_returnsGuestNumber_Integer() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    Integer expectedOutput = 2;
    assertEquals(expectedOutput, newParty.getGuestNumber());
  }

  @Test
  public void getFoodChoice_returnsFoodChoice_String() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    String expectedOutput = "BB";
    assertEquals(expectedOutput, newParty.getFoodChoice());
  }

  @Test
  public void getBeverageChoice_returnsBeverageChoice_String() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    String expectedOutput = "Wine";
    assertEquals(expectedOutput, newParty.getBeverageChoice());
  }

  @Test
  public void getEntertainmentChoice_returnsEntertainmentChoice_String() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    String expectedOutput = "Music";
    assertEquals(expectedOutput, newParty.getEntertainmentChoice());
  }

  @Test
  public void foodCostTotal_returnsfoodCost_Integer() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    Integer expectedOutput = 6.99;
    assertEquals(expectedOutput, newParty.foodCostTotal());
  }

  @Test
  public void beverageCostTotal_returnsbeverageCost_Integer() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    Integer expectedOutput = 7.99;
    assertEquals(expectedOutput, newParty.beverageCostTotal());
  }

  @Test
  public void entertainmentCostTotal_returnsEntertainmentCost_Integer() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    Integer expectedOutput = 2.99;
    assertEquals(expectedOutput, newParty.entertainmentCostTotal());
  }

  @Test
  public void eventCostTotal_returnsEventCost_Integer() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    Integer expectedOutput = 35.94;
    assertEquals(expectedOutput, newParty.eventCostTotal());
  }

}
