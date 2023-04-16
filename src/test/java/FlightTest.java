import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilotCaptain;
    Pilot pilotFirstOfficer;
    CabinCrewMember cabinCrewMemberPurser;

    CabinCrewMember cabinCrewMemberFlightAttendent1;
    CabinCrewMember cabinCrewMemberFlightAttendent2;
    CabinCrewMember cabinCrewMemberFlightAttendent3;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;
    Passenger passenger10;
    Passenger passenger11;

    @Before
    public void before() {
        flight = new Flight("FR756", "EDI", "LGW", "10:15", PlaneType.BOEING747);
        pilotCaptain = new Pilot("Johnny Depp", RankType.CAPTAIN, "JZ1234");
        pilotFirstOfficer = new Pilot("Chris Pratt", RankType.FIRSTOFFICER, "JZ1234");

        cabinCrewMemberPurser = new CabinCrewMember("Nick Jonas", RankType.PURSER);
        cabinCrewMemberFlightAttendent1 = new CabinCrewMember("Hilary Swank", RankType.FLIGHTATTENDENT);
        cabinCrewMemberFlightAttendent2 = new CabinCrewMember("Hilary Duff", RankType.FLIGHTATTENDENT);
        cabinCrewMemberFlightAttendent3 = new CabinCrewMember("Lindsay Lohan", RankType.FLIGHTATTENDENT);

        passenger1 = new Passenger("Shaz Seatter", 2);
        passenger2 = new Passenger("Pavels Muranovs", 1);
        passenger3 = new Passenger("Selena Putri", 2);
        passenger4 = new Passenger("Sam Smith", 1);
        passenger5 = new Passenger("Jane Doe", 2);
        passenger6 = new Passenger("John Doe", 1);
        passenger7 = new Passenger("Bill Smith", 2);
        passenger8 = new Passenger("William Smith", 1);
        passenger9 = new Passenger("Jack Russell", 2);
        passenger10 = new Passenger("Eka Putri", 1);
        passenger11 = new Passenger("Katrina Seatter", 1);


    }


    @Test
    public void hasFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("LGW", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("10:15", flight.getDepartureTime());
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void hasPilots() {
        flight.addPilot(pilotCaptain);
        flight.addPilot(pilotFirstOfficer);
        assertEquals(2, flight.getPilotCount());
    }

    @Test
    public void hasCabinCrew() {
        flight.addCabinCrew(cabinCrewMemberFlightAttendent1);
        flight.addCabinCrew(cabinCrewMemberFlightAttendent2);
        flight.addCabinCrew(cabinCrewMemberFlightAttendent3);
        flight.addCabinCrew(cabinCrewMemberPurser);
        assertEquals(4, flight.getCabinCrewCount());
    }

    @Test
    public void hasBookedPassengersEmpty() {
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void hasBookedPassengers() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(2, flight.getPassengerCount());
    }

    @Test
    public void planeHasCapacity() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(10, flight.getPlaneCapacity());
    }

    @Test
    public void bookPassengersOnPlane() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        flight.bookPassenger(passengers);
        assertEquals(6, flight.remainingAvailableSpace());

    }

    @Test
    public void cantBookPassengerOnPlane() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);
        passengers.add(passenger6);
        passengers.add(passenger7);
        passengers.add(passenger8);
        passengers.add(passenger9);
        passengers.add(passenger10);
        passengers.add(passenger11);
        flight.bookPassenger(passengers);
        assertEquals(10, flight.getPassengerCount());
        assertEquals(0, flight.remainingAvailableSpace());
    }
}
