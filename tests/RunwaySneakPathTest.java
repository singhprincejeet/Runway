import org.junit.Test;
import statem.Runway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
        outcome =runway.emergencyOver();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath2() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.setNoPlaneOnRunway(true);
        assertTrue(outcome);
        outcome =runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath3() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.setNoPlaneOnRunway(false);
        assertTrue(outcome);
        outcome =runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath4() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome =runway.landingComplete();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath5() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome =runway.planeTakesOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath6() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome =runway.repairCompleted();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath7() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.setInspectionSuccess(true);
        assertTrue(outcome);
        outcome =runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath8() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.setInspectionSuccess(false);
        assertTrue(outcome);
        outcome =runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath9() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome =runway.alarm();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath10() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome = runway.setNoPlaneOnRunway(true);
        assertTrue(outcome);
        outcome =runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath11() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome = runway.setNoPlaneOnRunway(false);
        assertTrue(outcome);
        outcome =runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath12() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome =runway.planeLanding();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath13() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome =runway.planeTakingOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath14() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome =runway.landingComplete();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath15() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome =runway.planeTakesOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath16() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome =runway.repair();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath17() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome =runway.repairCompleted();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath18() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome = runway.setInspectionSuccess(true);
        assertTrue(outcome);
        outcome =runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath19() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.alarm();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Emergency, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Null, runway.getRunwayStateMachineOpen());
        outcome = runway.setInspectionSuccess(false);
        assertTrue(outcome);
        outcome =runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath20() {
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
        outcome =runway.alarm();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath21() {
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
        outcome =runway.emergencyOver();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath22() {
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
        outcome = runway.setNoPlaneOnRunway(false);
        assertTrue(outcome);
        outcome =runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath23() {
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
        outcome =runway.planeLanding();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath24() {
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
        outcome =runway.planeTakingOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath25() {
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
        outcome =runway.landingComplete();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath26() {
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
        outcome =runway.planeTakesOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath27() {
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
        outcome =runway.repair();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath56() {
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
        outcome =runway.repairCompleted();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath57() {
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
        outcome = runway.setInspectionSuccess(true);
        assertTrue(outcome);
        outcome =runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath58() {
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
        outcome = runway.setInspectionSuccess(false);
        assertTrue(outcome);
        outcome =runway.check();
        assertFalse(outcome);
    }
}
