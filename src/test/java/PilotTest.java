import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilotCaptain;
    Pilot pilotFirstOfficer;

    @Before
    public void before() {
        pilotCaptain = new Pilot("Johnny Depp", RankType.CAPTAIN, "JZ1234");
        pilotFirstOfficer = new Pilot("Chris Pratt", RankType.FIRSTOFFICER, "JZ1234");
    }

    @Test
    public void hasName() {
        assertEquals("Johnny Depp", pilotCaptain.getName());
        assertEquals("Chris Pratt", pilotFirstOfficer.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.CAPTAIN, pilotCaptain.getRank());
        assertEquals(RankType.FIRSTOFFICER, pilotFirstOfficer.getRank());
    }

    @Test
    public void hasPilotLicence() {
        assertEquals("JZ1234", pilotCaptain.getPilotLicence());
        assertEquals("JZ1234", pilotFirstOfficer.getPilotLicence());
    }

    @Test
    public void pilotIsFlying() {
        assertEquals("The plane has taken off!", pilotCaptain.fly());
    }
}
