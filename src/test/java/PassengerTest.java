import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Shaz Seatter", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Shaz Seatter", passenger.getName());
    }

    @Test
    public void hasNumOfBags() {
        assertEquals(2, passenger.getNumOfBags());
    }
}
