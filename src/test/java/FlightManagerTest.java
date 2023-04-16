import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    @Before
    public void before() {
        flightManager = new FlightManager("FR756", "EDI", "LGW", "10:15", PlaneType.BOEING747);
    }

    @Test
    public void getPassengerBaggageAllowance() {
        assertEquals(50, flightManager.baggageWeightPerPassenger());
    }

}
