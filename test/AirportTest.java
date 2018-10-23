import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class AirportTest {

    @Mock
    private Plane planeMock;

    @Before
    public void beforeEachTest(){
        planeMock = Mockito.spy(new Plane());
        Mockito.when(planeMock.getName()).thenReturn("Mock name");
    }
    @Test
    public void landPlane() {
        Airport airport = new Airport();
        assertEquals("Mock name" + " has landed", airport.landPlane(planeMock));
    }

    @Test
    public void landingPlanePushestoArray() {
        Airport airport = new Airport();
        airport.landPlane(planeMock);
        assertTrue(airport.getPlaneList().contains(planeMock));
    }

    @Test
    public void takeOffPlane(){
        Airport airport = new Airport();
        airport.landPlane(planeMock);
        assertEquals("Mock name" + " has taken off", airport.takeOff(planeMock));
    }
    @Test
    public void takingOffPlaneRemovesItFromArray(){
        Airport airport = new Airport();
        airport.landPlane(planeMock);
        airport.takeOff(planeMock);
        assertTrue(airport.getPlaneList().isEmpty());
    }

    @Test
    public void planeCannotTakeOffIfNotInAirport(){
        Airport airport = new Airport();
        boolean thrown = false;
        try {
            airport.takeOff(planeMock);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void airportHasPlaneList() {
        Airport airport = new Airport();
        assertTrue(airport.getPlaneList().isEmpty());
    }



}
