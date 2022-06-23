import java.util.List;
import java.util.ArrayList;
import flightSearch.*;

public class Main {
  public static void main(String[] args) {

    FlightDatabase flightDb = new FlightDatabase();
    System.out.println(flightDb.checkIfFlightExists(FlightDatabase.BERLIN, FlightDatabase.TOKYO));
    System.out.println(flightDb.checkIfFlightExists("Monako", FlightDatabase.BERLIN));
    System.out.println(flightDb.checkIfFlightExists(FlightDatabase.MADRID, "Los Angeles"));
    flightDb.displayFlights(flightDb.getFlightsFromCity(FlightDatabase.BERLIN));
    flightDb.displayFlights(flightDb.getFlightsFromCity("WROCLAW"));
    flightDb.displayFlights(flightDb.getFlightsToCity(FlightDatabase.MADRID));
    flightDb.displayFlights(flightDb.getFlightsToCity("WROCLAW"));

    flightDb.displayFlightsFromCity(FlightDatabase.PORTO);
    flightDb.displayFlightsToCity(FlightDatabase.WARSAW);
    System.out.println("\n");

    flightDb.displayCities();

    System.out.println("\n");

    /*flightDb.displayFlights(flightDb.getFlights(FlightDatabase.BERLIN, FlightDatabase.TOKYO));*/
    List<Journey> journeys = flightDb.getFlights(FlightDatabase.BERLIN, FlightDatabase.TOKYO);
    System.out.println(journeys);
    journeys = flightDb.getFlights(FlightDatabase.PORTO, FlightDatabase.PARIS);
    System.out.println(journeys);
    System.out.println("\n");
    /*flightDb.displayFlights(flightDb.getFlights(FlightDatabase.PORTO, FlightDatabase.PARIS));*/
  }
}
