import java.util.ArrayList;

public class FlightManager extends Flight {

    private PlaneType planeType;
    public FlightManager(String flightNumber, String destination, String departureAirport, String departureTime, PlaneType planeType) {
        super(flightNumber, destination, departureAirport, departureTime, planeType);
    }

    public int baggageWeightPerPassenger() {
        return planeType.getTotalWeight() / 2 / planeType.getCapacity();
    }

    public void totalBaggageWeightPerFlight() {

    }
}
