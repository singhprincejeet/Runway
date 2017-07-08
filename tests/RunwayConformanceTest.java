import static org.junit.Assert.*;

import org.junit.Test;

import statem.Runway;

public class RunwayConformanceTest {

	@Test
	public void testConformance1() {
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

	@Test
	public void testConformance2() {
		boolean outcome = false;
		Runway runway = new Runway();
		assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
		assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
		outcome = runway.planeLanding();
		assertTrue(outcome);
		assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
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

    @Test
    public void testConformance3() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeTakesOff();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
    }

    @Test
    public void testConformance4() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeLanding();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.landingComplete();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
    }

    @Test
    public void testConformance5() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeTakingOff();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeTakesOff();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
    }

    @Test
    public void testConformance6() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeTakingOff();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.landingComplete();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
    }

    @Test
    public void testConformance7() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.planeTakingOff();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Occupied, runway.getRunwayStateMachineOpen());
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

    @Test
    public void testConformance8() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.setInspectionSuccess(true);
        assertTrue(outcome);
        outcome = runway.check();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.ReadyToOpen, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        outcome = runway.setNoPlaneOnRunway(true);
        assertTrue(outcome);
        outcome = runway.open();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
    }

    @Test
    public void testConformance9() {
        boolean outcome = false;
        Runway runway = new Runway();
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Null, runway.getRunwayStateMachineClosed());
        outcome = runway.repair();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.repairCompleted();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.InspectRepairs, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
        outcome = runway.setInspectionSuccess(false);
        assertTrue(outcome);
        outcome = runway.check();
        assertTrue(outcome);
        assertEquals("Wrong State",Runway.RunwayStateMachineOpen.Free, runway.getRunwayStateMachineOpen());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosed.Restoration, runway.getRunwayStateMachineClosed());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1.Restoration_1, runway.getRunwayStateMachineClosedRestoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2.Restoration_2, runway.getRunwayStateMachineClosedRestoration_2());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_1Restoration_1.Repair, runway.getRunwayStateMachineClosedRestoration_1Restoration_1());
        assertEquals("Wrong State",Runway.RunwayStateMachineClosedRestoration_2Restoration_2.Maintenance, runway.getRunwayStateMachineClosedRestoration_2Restoration_2());
    }

}
