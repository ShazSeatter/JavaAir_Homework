import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private String flightNumber;
    private String destination;

    private String departureAirport;

    private String departureTime;

    private PlaneType planeType;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, PlaneType planeType) {
        this.pilots = new ArrayList<Pilot>();
        this.passengers = new ArrayList<Passenger>(10);
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.planeType = planeType;
    }

//    Constructor GETTER methods
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPlaneCapacity() {
        return planeType.getCapacity();
    }

    public int bookPassenger(ArrayList<Passenger> passengers) {
        if(passengers != null) {
            for (Passenger passenger : passengers) {
                addPassengers(passenger);
            }
        }
        return remainingAvailableSpace();
    }

//    ARRAY METHODS
    public int getPilotCount() {
        return pilots.size();
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);

    }

    public int remainingAvailableSpace() {
        return getPlaneCapacity() - passengers.size();
    }
    public void addCabinCrew(CabinCrewMember cabinCrewMember) {
        cabinCrewMembers.add(cabinCrewMember);
    }
    public int getCabinCrewCount() {
        return cabinCrewMembers.size();
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public void addPassengers(Passenger passenger) {
        if (remainingAvailableSpace() > 0) {
            passengers.add(passenger);
        }
    }


}
