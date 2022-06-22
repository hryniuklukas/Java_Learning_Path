package flightSearch;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
  public static final String BERLIN = "Berlin";
  public static final String PARIS = "Paris";
  public static final String WARSAW = "Warsaw";
  public static final String MADRID = "Madrid";
  public static final String PORTO = "Porto";
  public static final String TOKYO = "Tokyo";
  ArrayList<Flight> flights = new ArrayList<>();

  public FlightDatabase() {
    this.flights.add(new Flight(BERLIN, TOKYO, 1500));
    this.flights.add(new Flight(PARIS, BERLIN, 400));
    this.flights.add(new Flight(WARSAW, PARIS, 300));
    this.flights.add(new Flight(MADRID, BERLIN, 400));
    this.flights.add(new Flight(BERLIN, WARSAW, 200));
    this.flights.add(new Flight(PARIS, MADRID, 300));
    this.flights.add(new Flight(PORTO, WARSAW, 900));
    this.flights.add(new Flight(MADRID, PORTO, 200));
    this.flights.add(new Flight(WARSAW, MADRID, 500));
  }

  public void displayCities() {
    List<String> cities = getCities();
    for (String element : cities) {
      System.out.println(element);
    }
  }

  public List<String> getCities() {
    ArrayList<String> result = new ArrayList<>();

    for (Flight flight : flights) {

      if (!result.contains(flight.departure)) {
        result.add(flight.departure);
      }
      if (!result.contains(flight.arrival)) {
        result.add(flight.arrival);
      }
    }
    return result;
  }

  public String checkIfFlightExists(String departure, String arrival) {
    for (Flight flight : flights) {
      if (flight.departure.equals(departure) && flight.arrival.equals(arrival)) {
        return "Flight found";
      }
    }
    return "Flight not found";
  }

  public List<Flight> getFlightsFromCity(String city) {
    ArrayList<Flight> result = new ArrayList<>();
    for (Flight flight : flights) {
      if (flight.departure.equals(city)) {
        result.add(flight);
      }
    }
    return result;
  }

  public List<Flight> getFlightsToCity(String city) {
    ArrayList<Flight> result = new ArrayList<>();
    for (Flight flight : flights) {
      if (flight.arrival.equals(city)) {
        result.add(flight);
      }
    }
    return result;
  }

  public List<Flight> getFlights(String start, String end) {
    List<Flight> startList = getFlightsFromCity(start);
    List<Flight> endList = getFlightsToCity(end);

    ArrayList<Flight> result = new ArrayList<>();

    for (Flight starting : startList) {
      if (starting.departure.equals(start) && starting.arrival.equals(end)) {
        result.add(starting);
      }
      for (Flight ending : endList) {
        if (starting.arrival.equals(ending.departure)) {
          result.add(starting);
          result.add(ending);
        }
      }
    }

    return result;
  }

  public void displayFlights(List<Flight> results) {
    if (results.isEmpty()) {
      System.out.println("No Flights found");
    }
    for (Flight result : results) {
      result.returnValues();
    }
  }

  public void displayFlightsToCity(String city) {
    List<Flight> result = getFlightsToCity(city);
    displayFlights(result);
  }

  public void displayFlightsFromCity(String city) {
    List<Flight> result = getFlightsFromCity(city);
    displayFlights(result);
  }
}
