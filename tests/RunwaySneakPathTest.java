import org.junit.Test;
import statem.Runway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Princejeet Singh San on 7/8/2017.
 */
public class RunwaySneakPathTest {
    @Test
    public void testSneakPath1() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome = runway.emergencyOver();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.ReadyToOpen, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome = runway.setNoPlaneOnRunway(true);
        assertTrue(outcome);
        outcome = runway.open();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
    }
}
