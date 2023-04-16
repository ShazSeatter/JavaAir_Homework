import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMemberFlightAttendent;
    CabinCrewMember cabinCrewMemberPurser;

    @Before
    public void before() {
        cabinCrewMemberFlightAttendent = new CabinCrewMember("Hilary Swank", RankType.FLIGHTATTENDENT);
        cabinCrewMemberPurser = new CabinCrewMember("Nick Jonas", RankType.PURSER);
    }

    @Test
    public void hasName() {
        assertEquals("Hilary Swank", cabinCrewMemberFlightAttendent.getName());
        assertEquals("Nick Jonas", cabinCrewMemberPurser.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.FLIGHTATTENDENT, cabinCrewMemberFlightAttendent.getRank());
        assertEquals(RankType.PURSER, cabinCrewMemberPurser.getRank());
    }

    @Test
    public void messageToPassengers() {
        assertEquals("Ladies and gentlemen, the Captain has turned on the Fasten SeAT Belt sign!", cabinCrewMemberPurser.messageToPassengers());
    }
}
