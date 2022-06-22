import java.util.ArrayList;

interface Details {
  public void returnDetails();
}

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

    flightDb.displayFlights(flightDb.getFlights(FlightDatabase.BERLIN, FlightDatabase.TOKYO));
    System.out.println("\n");
    flightDb.displayFlights(flightDb.getFlights(FlightDatabase.PORTO, FlightDatabase.PARIS));

//    Worker worker1 = new Worker();
//    Worker worker2 = new Worker("Jan", "Kowalski", 3000);
//    Boss boss1 = new Boss("Janusz", "Nowak", 4000, 200);
//
//    Details[] tab = new Details[3];
//    tab[0] = worker1;
//    tab[1] = worker2;
//    tab[2] = boss1;
//
//    for (Details d : tab) {
//      d.returnDetails();
//    }
  }
}

class Worker implements Details {
  String name;
  String surname;
  int pay;

  public Worker() {
    name = "";
    surname = "";
    pay = 0;
  }

  public Worker(String name, String surname, int pay) {
    this.name = name;
    this.surname = surname;
    this.pay = pay;
  }

  public void returnDetails() {
    System.out.println(name + " " + surname + " " + pay);
  }
}

class Boss extends Worker {
  int bonus;

  public Boss(String name, String surname, int pay, int bonus) {
    this.name = name;
    this.surname = surname;
    this.pay = pay;
    this.bonus = bonus;
  }

  @Override
  public void returnDetails() {
    System.out.println(name + " " + surname + " " + pay + " " + bonus);
  }
}

class Flight {
  String departure;
  String arrival;
  double price;

  public Flight(String departure, String arrival, double price) {
    this.departure = departure;
    this.arrival = arrival;
    this.price = price;
  }

  public void returnValues() {
    System.out.println(
        "Flight from " + this.departure + " to " + this.arrival);
  }

  public void changePrice(int percent) {
    this.price = this.price * (1 + (percent * 0.01));
    System.out.println("Price changed by " + (percent) + "%");
  }

}

class FlightDatabase {
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
  public void displayCities()
  {
    ArrayList<String> cities = getCities();
    for (String element : cities)
    {
      System.out.println(element);
    }
  }
  public ArrayList<String> getCities()
  {
    ArrayList<String> result = new ArrayList<String>();

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
  public ArrayList<Flight> getFlightsFromCity(String city)
  {
    ArrayList<Flight> result = new ArrayList<Flight>();
    for(Flight flight : flights)
    {
      if(flight.departure.equals(city))
      {
        result.add(flight);
      }
    }
    return result;
  }
  public ArrayList<Flight> getFlightsToCity(String city)
  {
    ArrayList<Flight> result = new ArrayList<Flight>();
    for(Flight flight : flights)
    {
      if(flight.arrival.equals(city))
      {
        result.add(flight);
      }
    }
    return result;
  }
  public ArrayList<Flight> getFlights(String start, String end)
  {
    ArrayList<Flight> startList = getFlightsFromCity(start);
    ArrayList<Flight> endList = getFlightsToCity(end);

    ArrayList<Flight> result = new ArrayList<Flight>();


    for(Flight starting : startList)
    {
      if(starting.departure.equals(start) && starting.arrival.equals(end))
      {
        result.add(starting);
      }
      for(Flight ending : endList)
      {
        if(starting.arrival.equals(ending.departure))
        {
          result.add(starting);
          result.add(ending);
        }
      }
    }

    return result;
  }
  public void displayFlights(ArrayList<Flight> results)
  {
    if(results.isEmpty())
    {
      System.out.println("No Flights found");
    }
    for(int i =0; i<results.size(); i++)
    {
      results.get(i).returnValues();
    }
  }
  public void displayFlightsToCity(String city)
  {
    ArrayList<Flight> result = getFlightsToCity(city);
    displayFlights(result);
  }
  public void displayFlightsFromCity(String city)
  {
    ArrayList<Flight> result = getFlightsFromCity(city);
    displayFlights(result);
  }
}
