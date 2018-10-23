import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
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
    public void takeOffPlane(){
        Airport airport = new Airport();
        assertEquals("Mock name" + " has taken off", airport.takeOff(planeMock));
    }
}
