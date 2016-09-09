import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanTest {

  @Test
  public void newParty_instanceCreated_Event() {
    Event newParty = new EventPlan (2, "BBQ", "Wine", "Music");
    assertEquals(true, newParty instanceof EventPlan);
  }

}
