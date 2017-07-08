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
        outcome = runway.planeLanding();
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
        outcome = runway.planeTakingOff();
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
        outcome =runway.planeTakesOff();
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
        outcome =runway.repair();
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
        outcome =runway.repairCompleted();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath28() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: emergency over
        outcome = runway.emergencyOver();
        assertFalse(outcome);
    }
    @Test
    public void testSneakPath29() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: open[noPlaneOnRunway]
        outcome = runway.setNoPlaneOnRunway(true);
        assertTrue(outcome);
        outcome = runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath30() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: open[!noPlaneOnRunway]
        outcome = runway.setNoPlaneOnRunway(false);
        assertTrue(outcome);
        outcome = runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath31() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: planeLanding
        outcome = runway.planeLanding();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath32() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: planeTakingOff
        outcome = runway.planeTakingOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath33() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: repairCompleted
        outcome = runway.repairCompleted();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath34() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: check[inspectionSuccess]
        outcome = runway.setInspectionSuccess(true);
        assertTrue(outcome);
        outcome = runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath35() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        //illegal event: check[!inspectionSuccess]
        outcome = runway.setInspectionSuccess(false);
        assertTrue(outcome);
        outcome = runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath36() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.alarm();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath37() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: emergency over
        outcome = runway.emergencyOver();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath38() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: open[noPlaneOnRunway]
        outcome = runway.setNoPlaneOnRunway(true);
        assertTrue(outcome);
        outcome = runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath39() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: open[!noPlaneOnRunway]
        outcome = runway.setNoPlaneOnRunway(false);
        assertTrue(outcome);
        outcome = runway.open();
        assertFalse(outcome);
    }

    //Error
    @Test
    public void testSneakPath40() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: planeLanding
        outcome = runway.planeLanding();
        assertFalse(outcome);
    }

    //Error
    @Test
    public void testSneakPath41() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: planeTakingOff
        outcome = runway.planeTakingOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath42() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.planeTakesOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath43() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.landingComplete();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath44() {
        //Error
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repair();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath45() {
        //Error
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: check[inspectionSuccess]
        outcome = runway.setInspectionSuccess(true);
        assertTrue(outcome);
        outcome = runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath46() {
        //Error
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: check[!inspectionSuccess]
        outcome = runway.setInspectionSuccess(false);
        assertTrue(outcome);
        outcome = runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath47() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.alarm();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath48() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: emergency over
        outcome = runway.emergencyOver();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath49() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: open[noPlaneOnRunway]
        outcome = runway.setNoPlaneOnRunway(true);
        assertTrue(outcome);
        outcome = runway.open();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath50() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: open[!noPlaneOnRunway]
        outcome = runway.setNoPlaneOnRunway(false);
        assertTrue(outcome);
        outcome = runway.open();
        assertFalse(outcome);
    }

    //Error
    @Test
    public void testSneakPath51() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: planeLanding
        outcome = runway.planeLanding();
        assertFalse(outcome);
    }

    //Error
    @Test
    public void testSneakPath52() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event: planeTakingOff
        outcome = runway.planeTakingOff();
        assertFalse(outcome);
    }
    @Test
    public void testSneakPath53() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.planeTakesOff();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath54() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.landingComplete();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath55() {
        //Error
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repair();
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
        outcome = runway.setInspectionSuccess(true);
        assertTrue(outcome);
        outcome =runway.check();
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
        outcome = runway.setInspectionSuccess(false);
        assertTrue(outcome);
        outcome =runway.check();
        assertFalse(outcome);
    }

    @Test
    public void testSneakPath59() {
        //Error
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State", Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State", Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        //illegal event:
        outcome = runway.repairCompleted();
        assertFalse(outcome); //
    }
}
