import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {
    @Test
    public void planeHasName(){
        Plane jumboJet = new Plane();
        jumboJet.setName("Chloe");
        assertEquals("Chloe", jumboJet.getName());
    }

    @Test
    public void planCanBeGivenAName() {
        Plane jumboJet = new Plane();
        jumboJet.setName("Chloe");
        assertEquals("Chloe", jumboJet.getName());
    }

}